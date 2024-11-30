package org.example.mywcs.handler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.log.XxlJobLogger;
import org.springframework.stereotype.Component;

/**
 * @Author：hb
 * @Package：org.example.mywcs.handler
 * @Project：my-wcs
 * @Date：30/11/2024 11:23 am
 */
@Component
public class XxlJobDemoHandler {
    @XxlJob("demoJobHandler")
    public ReturnT<String> demoJobHandler(String param) throws Exception {
        XxlJobLogger.log("java, Hello World~~~");
        XxlJobLogger.log("param:" + param);
        System.out.println("java, Hello World~~~");
        return ReturnT.SUCCESS;
    }
}
