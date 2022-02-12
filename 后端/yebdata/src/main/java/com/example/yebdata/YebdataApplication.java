package com.example.yebdata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@MapperScan("com.example.yebdata.dao")
public class YebdataApplication {

    public static void main(String[] args) {
        SpringApplication.run(YebdataApplication.class, args);
    }

}
