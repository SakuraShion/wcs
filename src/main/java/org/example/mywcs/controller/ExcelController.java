package org.example.mywcs.controller;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author：hb
 * @Package：org.example.mywcs.controller
 * @Project：my-wcs
 * @Date：30/11/2024 4:37 pm
 */
@RestController
@RequestMapping("/excel")
public class ExcelController {
    @PostMapping("/excel")
    public void exportExcel(@RequestParam("file") MultipartFile file ) throws IOException {
        String currentDir =System.getProperty("user.dir");
        String filePath = currentDir + File.separator + file.getOriginalFilename();
        // 创建目标文件对象
        File destinationFile = new File(filePath);
        file.transferTo(destinationFile);
        String lcoalFilePath=destinationFile.getPath();
        File file1=new File(lcoalFilePath);
        FileInputStream fileInputStream=new FileInputStream(file1);
        //通过流的方式读取文件
        XSSFWorkbook hssfWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet hssfSheet=hssfWorkbook.getSheet("Sheet1");
        //通过sheet的名字来获取数据
        XSSFSheet hssfSheet1=hssfWorkbook.getSheetAt(0);
        //通过下标来获取数据
        int firstRowNum=hssfSheet1.getFirstRowNum();
        //获取第一行的下标
        int lastRowNum = hssfSheet1.getLastRowNum();
        //获取最后一行的下标
        /**
         * 注意：比如我们这一行有四列，则lastRowNum=3，firstRowNum=0
         * 所以下面的for循环为<=
         * */
        for (int i=firstRowNum;i<=lastRowNum;i++){
            Row row=hssfSheet1.getRow(i);
            //根据下标，获取对应行的数据
            int firstCellNum=row.getFirstCellNum();
            //获取对应行的第一个cell的下标
            int lastCellNum=row.getLastCellNum();
            //获取对应行的最后一个cell的下标
            /**
             * 注意：比如这一行有四个单元格，则firstCellNum=0，lastCellNum=4，注意=4！！！！！，并不是等于3
             * 所以下面的for循环为<
             * 之所以没有在循环外就确定这两个值，是因为你没有办法确定每一行的列数都一致
             * */
            List<String> list=new ArrayList<>();
            //新建一个list用来存放数据
            for (int j=firstCellNum;j<lastCellNum;j++){
                Cell cell=row.getCell(j);
                //通过下标获取对应的单元格的信息
                System.out.print(cell+"\t");
                // 增加这一部分以获取单元格颜色
                CellStyle style = cell.getCellStyle();
                if (style != null) {
                    Color color = style.getFillForegroundColorColor();
                    String cellColor = getCellColor(cell);
                    System.out.print(" (颜色: " + cellColor + ")");  // 显示颜色
                }
                list.add(cell.toString());

            }
            System.out.println();
            //确保每一行数据打印出来都跨行
        }
        fileInputStream.close();
        //使用完成之后要记得关闭这个流
    }
    private String getCellColor(Cell cell) {
        CellStyle style = cell.getCellStyle();
        if (style != null) {
            short fillColorIndex = style.getFillForegroundColor();
            Color fillColor = style.getFillForegroundColorColor();

            // 检查是否为 XSSFColor
            if (fillColor instanceof XSSFColor) {
                XSSFColor xssfColor = (XSSFColor) fillColor;
                return xssfColor.getARGBHex(); // 返回 ARGB 十六进制值
            }

            // 如果是索引颜色，检查索引是否有效
            if (fillColorIndex != -1) {
                // 检查 fillColorIndex 是否在有效范围内
                if (fillColorIndex < IndexedColors.values().length) {
                    return IndexedColors.values()[fillColorIndex].name(); // 返回颜色名称
                } else {
                    return "索引超出范围"; // 处理索引超出范围的情况
                }
            }
        }
        return "无填充颜色"; // 返回“无填充颜色”以指示未填充的单元格
    }
}
