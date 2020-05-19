package com.obunda.cms_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EntityScan("com.obunda.cms.domain")
@EnableDiscoveryClient
public class CmsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmsApiApplication.class, args);
	}

}
