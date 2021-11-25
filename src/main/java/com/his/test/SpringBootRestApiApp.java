package com.his.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringBootRestApiApp{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiApp.class, args);
	}

}
