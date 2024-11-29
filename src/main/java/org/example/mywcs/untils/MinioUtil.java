package org.example.mywcs.untils;

import cn.hutool.core.date.DateUtil;
import com.google.common.base.Charsets;
import io.minio.*;
import io.minio.errors.*;
import io.minio.http.Method;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @Author：hb
 * @Package：org.example.mywcs.untils
 * @Project：my-wcs
 * @Date：28/11/2024 4:54 pm
 */

@Component
public class MinioUtil {
    @Value("${minio.bucketName}")
    private String bucketName;
    @Resource
    public MinioClient minioClient;
    public static MinioUtil minioUtil;
    public MinioUtil() {
    }

    @PostConstruct
    public void init() {
        minioUtil = this;
    }
    public static String uploadFile(InputStream inputStream, String objectName, String fileName) {
        if (!StringUtils.isEmpty(objectName)) {
            objectName = objectName + "/" + fileName;
        }
        try {
            if (objectName != null && !"".equals(objectName)) {
                try {
                    minioUtil.minioClient.putObject(PutObjectArgs
                            .builder()
                            .bucket(minioUtil.bucketName)
                            .object(objectName)
                            .stream(inputStream, inputStream.available(), -1)
                            .contentType("image/jpeg").build());
                } catch (Exception e) {
                    throw new MinioException("添加存储对象异常" + e);
                }
            } else {
                throw new MinioException("存储对象名称objectName不能为空！");
            }
           return minioUtil.getUrl(objectName);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(("上传发生错误: {}！" + ex.getMessage()));
            return ex.getMessage();
        }
    }

        public static InputStream download(String fileUrl) {
            try {
                fileUrl = fileUrl.substring(fileUrl.indexOf(minioUtil.bucketName) + minioUtil.bucketName.length());
                InputStream inputStream = minioUtil.get(fileUrl);
                return inputStream;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    public static void batchDownload(List<String> fileUrlList, String zipName, HttpServletResponse httpServletResponse) {
        ZipOutputStream zos;
        ZipEntry zipEntry;
        byte[] buff = new byte[1024];
        if (fileUrlList != null && !fileUrlList.isEmpty()) {
            try {
                if (StringUtils.isEmpty(zipName)) {
                    zipName = "批量下载" + DateUtil.format(new Date(), "yyyyMMddHHmmss");
                }
                //清除缓冲区中存在的所有数据以及状态代码和标头。如果已提交响应，则此方法将抛出IllegalStateException
                httpServletResponse.reset();
                //Content-Disposition为属性名，attachment以附件方式下载，filename下载文件默认名字
                httpServletResponse.setHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode(zipName, Charsets.UTF_8.name()) + ".zip");
                //另存为弹框加载
                httpServletResponse.setContentType("application/x-msdownload");
                httpServletResponse.setCharacterEncoding("utf-8");
                zos = new ZipOutputStream(httpServletResponse.getOutputStream());
                for (String fileUrl : fileUrlList) {
                    //获取minio对应路径文件流（从数据库中获取的url是编码的，这里要先进行解码，不然minioClient.getObject()方法里面会再进行一次编码，就获取不到对象）
                    String url = URLDecoder.decode(fileUrl, Charsets.UTF_8.name());
                    String downloadUrl = url.substring(url.indexOf(minioUtil.bucketName) + minioUtil.bucketName.length());
                    InputStream inputStream = minioUtil.get(downloadUrl);
                    String fileName = url.substring(url.lastIndexOf("/"), url.lastIndexOf("."));
                    zipEntry = new ZipEntry(fileName + url.substring(url.lastIndexOf(".")));
                    zos.putNextEntry(zipEntry);
                    int length;
                    while ((length = inputStream.read(buff)) > 0) {
                        zos.write(buff, 0, length);
                    }
                }
                zos.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            } catch (MinioException e) {
                throw new RuntimeException(e);
            } finally {
            }
        } else {
        }

    }
    public static void removeFile(String fileUrl) {
        try {
            String downloadUrl = fileUrl.substring(fileUrl.indexOf(minioUtil.bucketName) + minioUtil.bucketName.length());
            minioUtil.rm(downloadUrl);
        } catch (Exception e) {
            e.printStackTrace();

        }

    }
    public static void batchRemoveFile(List<String> fileUrlList) {
        if (fileUrlList != null && !fileUrlList.isEmpty()) {
            try {
                for (String fileUrl : fileUrlList) {
                    String downloadUrl = fileUrl.substring(fileUrl.indexOf(minioUtil.bucketName) + minioUtil.bucketName.length());
                    minioUtil.rm(downloadUrl);
                }

            } catch (Exception e) {
                e.printStackTrace();

            }
        }
    }

        public InputStream get(String objectName) throws MinioException {
            InputStream inputStream;
            try {
                inputStream = this.minioClient.getObject(GetObjectArgs.builder().bucket(this.bucketName).object(objectName).build());
                return inputStream;
            } catch (Exception e) {

                throw new MinioException("读取存储对象异常"+ e);
            }
        }
    public void download(String objectName, String fileName) throws MinioException {
        try {
            this.minioClient.downloadObject(DownloadObjectArgs.builder().bucket(this.bucketName).object(objectName).filename(fileName).build());
        } catch (Exception e) {
            throw new MinioException("下载发生错误"+ e);
        }
    }
    public String getUrl(String objectName) throws MinioException {
        try {
            return this.minioClient.getObjectUrl(this.bucketName, objectName);
        } catch (Exception e) {
            throw new MinioException("获取存储对象url异常"+ e);
        }
    }
    public void rm(String objectName) throws MinioException {
        try {
            this.minioClient.removeObject(RemoveObjectArgs.builder().bucket(this.bucketName).object(objectName).build());
        } catch (Exception e) {
            throw new MinioException("删除存储对象异常"+ e);
        }
    }
    public static String getpresign(String filePath) throws ServerException, InvalidBucketNameException, InsufficientDataException, ErrorResponseException, InvalidExpiresRangeException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        if (!StringUtils.isEmpty(filePath)) {
            try {
                minioUtil.minioClient.statObject(StatObjectArgs.builder().bucket(minioUtil.bucketName).object(filePath).build());
                    return minioUtil.minioClient.getPresignedObjectUrl(GetPresignedObjectUrlArgs.builder().method(Method.GET).bucket(minioUtil.bucketName).object(filePath).expiry(1, TimeUnit.HOURS).build());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;

    }

}
