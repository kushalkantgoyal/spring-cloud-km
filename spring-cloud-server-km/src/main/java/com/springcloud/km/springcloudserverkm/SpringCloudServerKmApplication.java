package com.springcloud.km.springcloudserverkm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudServerKmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServerKmApplication.class, args);
    }
}
