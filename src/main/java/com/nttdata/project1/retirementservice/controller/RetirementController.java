package com.nttdata.project1.retirementservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.web.bind.annotation.DeleteMapping;*/
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.project1.retirementservice.service.RetirementService;
import com.nttdata.project1.retirementservice.entity.Retirement;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/retirement")
public class RetirementController {

	@Autowired
	private RetirementService service ;
	
	@GetMapping("/{account}")
	public Flux<Retirement> getAll(@PathVariable("account") String account){
		return service.findAll();
	}
	
	@GetMapping("/{account}/{retirement}")
	public Mono<Retirement> findByid(@PathVariable("account") String account,@PathVariable("retirement") String deposit){
		return null;
	}
	
	@PostMapping("/{account}")
	public Mono<Retirement> create(@RequestBody Retirement retirement, @PathVariable("account") String account){
		retirement.setIdAccount(account);
		retirement.setActive(true);
		return service.save(retirement);
	}
	
	@PutMapping("/{account}")
	public Mono<Retirement> update(@RequestBody Retirement retirement, @PathVariable("account") String account ){
		retirement.setIdAccount(account);
		retirement.setActive(true);
		return service.update(retirement);
	}
	
	/*@DeleteMapping("/{id}")
	public Mono<Void> deleteById(@PathVariable("id") String id){
	  return null;
	}*/
	
	
	
	
	
}
