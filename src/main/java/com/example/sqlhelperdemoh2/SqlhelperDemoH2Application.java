package com.example.sqlhelperdemoh2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@MapperScan("com.example.sqlhelperdemoh2.**.mapper")
@SpringBootApplication
public class SqlhelperDemoH2Application {

    public static void main(String[] args) {
        SpringApplication.run(SqlhelperDemoH2Application.class, args);
    }

}
