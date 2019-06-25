package org.play.user.impl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("org.play.user.impl.mapper")
public class StartUp {

	public static void main(String[] args) {
	    SpringApplication.run(StartUp.class, args);
	  }
}
