package com.fzq.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigurationProperties
//@ComponentScan(basePackages = { "com.fzq.test"})
//@MapperScan(basePackages = { "com.fzq.test.mapper"})
public class SbtwithmybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbtwithmybatisApplication.class, args);
	}

}
