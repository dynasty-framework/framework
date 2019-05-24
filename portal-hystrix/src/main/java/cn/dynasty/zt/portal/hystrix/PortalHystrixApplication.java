package cn.dynasty.zt.portal.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


/**
 * @ClassName: PortalHystrixApplication
 * @description: TODO
 * @author: zhaotao
 * @create: 2019-05-24 11:36
 **/
@SpringBootApplication
@EnableHystrixDashboard  //开启监控注解
public class PortalHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortalHystrixApplication.class, args);
    }


}
