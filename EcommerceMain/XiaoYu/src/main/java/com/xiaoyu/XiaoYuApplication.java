package com.xiaoyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class XiaoYuApplication {
	public static void main(String[] args) {
		SpringApplication.run(XiaoYuApplication.class, args);
	}
}
