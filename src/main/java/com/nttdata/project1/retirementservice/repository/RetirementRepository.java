package com.nttdata.project1.retirementservice.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.nttdata.project1.retirementservice.entity.Retirement;

public interface RetirementRepository extends ReactiveMongoRepository<Retirement, String>{


}
