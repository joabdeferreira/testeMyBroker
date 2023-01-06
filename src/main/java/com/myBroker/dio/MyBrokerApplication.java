package com.myBroker.dio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EntityScan(basePackages = {"com.myBroker.dio.entity"})
@SpringBootApplication
public class MyBrokerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBrokerApplication.class, args);
	}

}
