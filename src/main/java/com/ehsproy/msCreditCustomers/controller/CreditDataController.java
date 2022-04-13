package com.ehsproy.msCreditCustomers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ehsproy.msCreditCustomers.model.CreditData;
import com.ehsproy.msCreditCustomers.service.ICreditDataService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/credit")
public class CreditDataController {
	
private final ICreditDataService creditService;
	
	@GetMapping("/bycustomer/{idCustomer}")
	public Flux<CreditData> findByIdCustomer(@PathVariable("idCustomer") String idCustomer) {
		return creditService.findByIdCustomer(idCustomer);
	}

	@PostMapping
	public Mono<CreditData> save(@RequestBody CreditData creditData) {
		return creditService.save(creditData);
	}

	@PutMapping
	public Mono<CreditData> put(@RequestBody CreditData creditData) {
		return creditService.save(creditData);
	}
	
	@GetMapping("/{id}")
	public Mono<CreditData> findById(String id) {
		return creditService.findById(id);
	}
	
}
