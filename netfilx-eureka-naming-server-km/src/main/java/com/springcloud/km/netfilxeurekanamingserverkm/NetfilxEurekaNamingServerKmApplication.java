package com.springcloud.km.netfilxeurekanamingserverkm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetfilxEurekaNamingServerKmApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetfilxEurekaNamingServerKmApplication.class, args);
    }
}
