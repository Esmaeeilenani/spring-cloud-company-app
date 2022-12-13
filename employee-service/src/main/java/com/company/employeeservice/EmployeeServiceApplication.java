package com.company.employeeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import javax.persistence.Entity;
import javax.persistence.Id;

@SpringBootApplication
//spring cloud way to call restAPI
@EnableFeignClients
@EnableEurekaClient
public class EmployeeServiceApplication {

	//will be deprecated soon
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	//is the new Bean to call restAPI
	@Bean
	public WebClient webClient(){

		return WebClient.builder().build();
	}


	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
