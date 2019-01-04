package com.albert.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

//配置注解,类似xml
//@Configuration
//指定属性文件
//@PropertySource("classpath:jdbc.properties")
public class JdbcConfig {

    //声明在方法上面，将方法的返回值存到Bean容器
//    @Bean
//    public DataSource dataSource() {
//        return null;
//    }

}
