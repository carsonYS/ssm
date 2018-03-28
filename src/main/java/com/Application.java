package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication  
@EnableTransactionManagement// 开启事务  
@ConfigurationProperties(prefix="spring.datasource")    
@MapperScan("com.my.hello.dao")
public class Application {  
      
   
      
    public static void main(String[] args) {  
        SpringApplication.run(Application.class, args);  
    }  
}  