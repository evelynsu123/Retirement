package com.nttdata.project1.retirementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.project1.retirementservice.entity.Retirement;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class RetirementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetirementServiceApplication.class, args);
	}

	
	
}
