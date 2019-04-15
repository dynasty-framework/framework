package cn.dynasty.zt.test.dao.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @ClassName: DruidConfiguration
 * @description: Druid数据源连接池配置类，
 * @author: zhaotao
 * @create: 2019-04-14 13:55
 **/
//@Configuration
public class DruidConfiguration {

    /*@ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druid() {
        return new DruidDataSource();
    }*/
}
