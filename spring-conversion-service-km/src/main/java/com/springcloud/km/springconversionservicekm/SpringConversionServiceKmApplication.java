package com.springcloud.km.springconversionservicekm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.springcloud.km.springconversionservicekm")
public class SpringConversionServiceKmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConversionServiceKmApplication.class, args);
	}
}
