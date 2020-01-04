package com.ecompro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@SpringBootApplication
@EnableEurekaClient
public class OAuth2ServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(OAuth2ServerApplication.class, args);
	}
}
