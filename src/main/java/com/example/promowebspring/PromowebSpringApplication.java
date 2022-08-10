package com.example.promowebspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PromowebSpringApplication {

	@GetMapping("/message")
	public String message(){
		return "First Spring Azure web app - Second Edition";
	}

	public static void main(String[] args) {
		SpringApplication.run(PromowebSpringApplication.class, args);
	}

}
