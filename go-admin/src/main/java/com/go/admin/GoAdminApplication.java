package com.go.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.go.admin.mapper")
public class GoAdminApplication {
  public static void main(String[] args) {
    SpringApplication.run(GoAdminApplication.class, args);
  }
}
