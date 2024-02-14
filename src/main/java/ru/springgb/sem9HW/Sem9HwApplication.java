package ru.springgb.sem9HW;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EntityScan("ru.springgb.cliententity.model")
public class Sem9HwApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sem9HwApplication.class, args);
	}

}
