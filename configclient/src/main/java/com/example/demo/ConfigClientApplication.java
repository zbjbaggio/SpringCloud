package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
@RefreshScope
public class ConfigClientApplication {

	@Value("${foo}")
	private String value;

	@RequestMapping("/hi")
	public String hi() {
		return value;
	}

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
}
