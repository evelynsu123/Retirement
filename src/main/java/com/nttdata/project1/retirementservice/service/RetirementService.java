package com.nttdata.project1.retirementservice.service;

import com.nttdata.project1.retirementservice.entity.Retirement;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface RetirementService {
	
	Flux<Retirement> findAll();
	Mono<Retirement> save(Retirement retirement);
	Mono<Retirement> update(Retirement retirement);
    
    
}
