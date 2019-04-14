package cn.dynasty.zt.portal.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @ClassName: PortalServerApplication
 * @description: TODO
 * @author: zhaotao
 * @create: 2019-04-12 10:48
 **/
//服务提供者项目启动类要添加数据自动配置类，和启动时扫描的包路径
    /* mybatis分页插件
     * <dependency>
            <groupId>com.github.pagehelper</groupId>
            <artifactId>pagehelper-spring-boot-starter</artifactId>
            <version>1.2.7</version>
        </dependency>
        添加pageheloer依赖后会报错  Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.
        解决这个问题需要在启动类@SpringBootApplication后加(exclude = DataSourceAutoConfiguration.class)
     **/
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//@MapperScan("cn.dynasty.zt.portal.provider.mapper")
public class PortalServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortalServerApplication.class, args);
    }
}
