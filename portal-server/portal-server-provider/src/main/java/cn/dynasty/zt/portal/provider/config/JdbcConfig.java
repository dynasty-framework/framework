package cn.dynasty.zt.portal.provider.config;

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
     * 数据库用户名
     */
    @Value("${spring.datasource.tomcat.username}")
    private String userName;
    /**
     * 驱动名称
     */
    @Value("${spring.datasource.tomcat.driver-class-name}")
    private String driverClass;
    /**
     * 数据库连接url
     */
    @Value("${spring.datasource.tomcat.url}")
    private String url;
    /**
     * 数据库密码
     */
    @Value("${spring.datasource.tomcat.password}")
    private String password;

    /**
     * 数据库连接池初始化大小
     */
    @Value("${spring.datasource.tomcat.initial-size}")
    private int initialSize;

    /**
     * 数据库连接池最小最小连接数
     */
    @Value("${spring.datasource.tomcat.min-idle}")
    private int minIdle;

    /**
     * 数据库连接池最大连接数
     */
    @Value("${spring.datasource.tomcat.max-active}")
    private int maxActive;

    /**
     * 获取连接等待超时的时间
     */
    @Value("${spring.datasource.tomcat.max-wait}")
    private long maxWait;

    /**
     * 多久检测一次
     */
    @Value("${spring.datasource.tomcat.time-between-eviction-runs-millis}")
    private long timeBetweenEvictionRunsMillis;

    /**
     * 连接在池中最小生存的时间
     */
    @Value("${spring.datasource.tomcat.min-evictable-idle-time-millis}")
    private long minEvictableIdleTimeMillis;

    /**
     * 测试连接是否有效的sql
     */
    @Value("${spring.datasource.tomcat.validation-query}")
    private String validationQuery;

    /**
     * 申请连接的时候检测，如果空闲时间大于timeBetweenEvictionRunsMillis，检测连接是否有效
     */
    @Value("${spring.datasource.tomcat.test-while-idle}")
    private boolean testWhileIdle;

    /**
     * 申请连接时,检测连接是否有效
     */
    @Value("${spring.datasource.tomcat.test-on-borrow}")
    private boolean testOnBorrow;

    /**
     * 归还连接时,检测连接是否有效
     */
    @Value("${spring.datasource.tomcat.test-on-return}")
    private boolean testOnReturn;



}
