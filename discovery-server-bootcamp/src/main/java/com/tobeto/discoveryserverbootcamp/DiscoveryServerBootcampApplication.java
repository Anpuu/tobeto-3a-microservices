package com.tobeto.discoveryserverbootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerBootcampApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerBootcampApplication.class, args);
	}

}
