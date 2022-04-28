package com.springdeploy.azuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeployOfSpringInAzureApplication {
	@GetMapping("/message")
    public String message(){
	return "Hello!!! Your is deployed successfully";
    }
	public static void main(String[] args) {
		SpringApplication.run(DeployOfSpringInAzureApplication.class, args);
	}

}
