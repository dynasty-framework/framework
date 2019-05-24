package cn.dynasty.zt.portal.turbine;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: PortalTurbineApplication
 * @description: 同时监控多个微服务的启动类
 * @author: zhaotao
 * @create: 2019-05-24 13:24
 **/
@SpringBootApplication
@EnableTurbine //开启turbine的支持
@EnableHystrixDashboard  //开启监控注解,允许使用图形化的界面展示。
public class PortalTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortalTurbineApplication.class, args);
    }


}
