package cn.dynasty.zt.test.dao.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 提供数据库连接池工具方法
 * @author zt
 * @date 2019年4月12日 16:21:33
 */

@Component
@Data
public class JdbcConfig {

    /**
     * 数据库连接池初始化大小
     */
    @Value("${spring.datasource.druid.initial-size}")
    private int initialSize;

	 /**
     * 数据库用户名
     */
    @Value("${spring.datasource.druid.username}")
    private String userName;
    /**
     * 驱动名称
     */
    @Value("${spring.datasource.druid.driver-class-name}")
    private String driverClass;
    /**
     * 数据库连接url
     */
    @Value("${spring.datasource.druid.url}")
    private String url;
    /**
     * 数据库密码
     */
    @Value("${spring.datasource.druid.password}")
    private String password;



    /**
     * 数据库连接池最小最小连接数
     */
    @Value("${spring.datasource.druid.min-idle}")
    private int minIdle;

    /**
     * 数据库连接池最大连接数
     */
    @Value("${spring.datasource.druid.max-active}")
    private int maxActive;





}
