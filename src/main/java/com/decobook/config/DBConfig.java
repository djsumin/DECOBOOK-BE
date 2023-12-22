package com.decobook.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {
        "com.decobook.model.dao",
})
public class DBConfig {

}