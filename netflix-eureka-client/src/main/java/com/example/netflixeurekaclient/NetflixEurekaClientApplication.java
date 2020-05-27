package com.example.netflixeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NetflixEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixEurekaClientApplication.class, args);
    }

}
