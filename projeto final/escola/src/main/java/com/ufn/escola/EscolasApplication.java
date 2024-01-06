package com.ufn.escola;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@SpringBootApplication
@SecurityRequirement(name = "bearerAuth")
public class EscolasApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscolasApplication.class, args);
	}

}
