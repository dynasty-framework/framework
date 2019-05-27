package cn.dynasty.zt.portal.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


/**
 * @ClassName: PortalHystrixApplication
 * @description: hystrix微服务监控启动类
 * @author: zhaotao
 * @create: 2019-05-24 11:36
 **/
@SpringBootApplication
//开启监控图形化界面注解
@EnableHystrixDashboard
public class PortalHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortalHystrixApplication.class, args);
    }


}
