package cn.dynasty.zt.portal.consumer;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName: PortalConsumerApplication
 * @description: TODO
 * @author: zhaotao
 * @create: 2019-04-12 11:21
 **/
@SpringBootApplication
@EnableHystrix//然后在Application类上增加@EnableHystrix来启用hystrix starter：
public class PortalConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortalConsumerApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean getServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }

}
