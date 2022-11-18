package com.codeking.Config;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author : codeking
 * @date : 2022/11/16 20:53
 */
@Configuration
@ComponentScan(basePackages = "com.codeking") //组件扫描
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableTransactionManagement //开启事务
public class SpringConfig {
    //创建数据库连接池
    @Bean
    public DruidDataSource getDataSource() throws IOException {
        DruidDataSource dataSource = new DruidDataSource();
        // 通过io流读取文件
        InputStream in = SpringConfig.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties prop = new Properties();
        prop.load(in);
        dataSource.setDriverClassName(prop.getProperty("prop.driverClass"));
        dataSource.setUrl(prop.getProperty("prop.url"));
        dataSource.setUsername(prop.getProperty("prop.userName"));
        dataSource.setPassword(prop.getProperty("prop.password"));
        return dataSource;
    }

    //创建 JdbcTemplate 对象
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
        //到 ioc 容器中根据类型找到 dataSource
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    //创建事务管理器
    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }
}
