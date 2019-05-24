package cn.dynasty.zt.portal.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @ClassName: PortalTurbineApplication
 * @description: 同时监控多个微服务的启动类
 * @author: zhaotao
 * @create: 2019-05-24 13:24
 **/
@SpringBootApplication
@EnableTurbine
public class PortalTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortalTurbineApplication.class, args);
    }
}
