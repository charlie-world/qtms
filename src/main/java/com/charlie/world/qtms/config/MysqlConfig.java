package com.charlie.world.qtms.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Slf4j
@Configuration
public class MysqlConfig {

    private String url;
    private String username;
    private String password;
    private String driverClassName;

    private void init() {
        try {
            url = System.getenv("MYSQL_URL");
            username = System.getenv("MYSQL_USERNAME");
            password = System.getenv("MYSQL_PASSWORD");
            driverClassName = "com.mysql.cj.jdbc.driver";
        } catch (Exception e) {
            throw new IllegalArgumentException("mysql config validation failed");
        }
    }

    @Bean
    public DataSource dataSource() {
        init();
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

}
