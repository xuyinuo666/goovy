package com.go.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@EnableDiscoveryClient
@SpringBootApplication
@EnableOAuth2Client
@EnableFeignClients // 开启feign
public class OauthApplication {
    public static void main(String[] args) {
        SpringApplication.run(OauthApplication.class);
    }
}
