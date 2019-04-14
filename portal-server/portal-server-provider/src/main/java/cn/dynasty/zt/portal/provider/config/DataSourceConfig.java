package cn.dynasty.zt.portal.provider.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * 提供数据库连接池工具方法
 * @author zt
 * @date 2019年4月12日 16:21:33
 */
/**
 * @Author zhaotao
 *  测试搭建数据库连接时，
 **/
@Configuration
@MapperScan(basePackages="cn.dynasty.zt.portal.provider.mapper", sqlSessionTemplateRef="sqlSessionTemplate")
public class DataSourceConfig {

	 private static final Logger logger = LoggerFactory.getLogger(DataSourceConfig.class);

	 @Autowired
	 private JdbcConfig jdbcConfig;
	 
	@Bean(name="datasource")
    @Primary //在同样的DataSource中，首先使用被标注的DataSource
    public DataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(jdbcConfig.getUrl());
        druidDataSource.setUsername(jdbcConfig.getUserName());
        druidDataSource.setPassword(jdbcConfig.getPassword());
        druidDataSource.setInitialSize(jdbcConfig.getInitialSize());
        druidDataSource.setMinIdle(jdbcConfig.getMinIdle());
        druidDataSource.setMaxActive(jdbcConfig.getMaxActive());
        druidDataSource.setTimeBetweenEvictionRunsMillis(jdbcConfig.getTimeBetweenEvictionRunsMillis());
        druidDataSource.setMinEvictableIdleTimeMillis(jdbcConfig.getMinEvictableIdleTimeMillis());
        druidDataSource.setValidationQuery(jdbcConfig.getValidationQuery());
        druidDataSource.setTestWhileIdle(jdbcConfig.isTestWhileIdle());
        druidDataSource.setTestOnBorrow(jdbcConfig.isTestOnBorrow());
        druidDataSource.setTestOnReturn(jdbcConfig.isTestOnReturn());
        druidDataSource.setMaxPoolPreparedStatementPerConnectionSize(20);
        try {
            druidDataSource.setFilters("stat,log4j,wall");
        } catch (SQLException e) {
            if (logger.isInfoEnabled()) {
                logger.info(e.getMessage(), e);
            }
        }
        return druidDataSource;
    }


}
