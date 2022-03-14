package com.nttdata.project1.retirementservice.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.project1.retirementservice.entity.Retirement;
import com.nttdata.project1.retirementservice.repository.RetirementRepository;
import com.nttdata.project1.retirementservice.service.RetirementService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class RetirementServiceImpl implements RetirementService{
 
	@Autowired
	private RetirementRepository repository;
	
	@Override
	public Flux<Retirement> findAll() {
		
		return repository.findAll() ;
	}

	@Override
	public Mono<Retirement> save(Retirement retirement) {
		
		return repository.save(retirement);
	}

	@Override
	public Mono<Retirement> update(Retirement retirement) {
		
		return repository.save(retirement);
	}

}