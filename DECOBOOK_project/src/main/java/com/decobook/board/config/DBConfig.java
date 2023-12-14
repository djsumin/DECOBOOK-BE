package com.decobook.board.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.decobook.board.model.dao")
public class DBConfig {

}
