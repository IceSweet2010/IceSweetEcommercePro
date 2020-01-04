package com.ecompro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.ecompro.mapper")
public class UserCenterServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserCenterServerApplication.class, args);
	}
}
