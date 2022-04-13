package com.ehsproy.msCreditCustomers.service;

import com.ehsproy.msCreditCustomers.model.CreditData;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICreditDataService {

	Flux<CreditData> findByIdCustomer(String idCustomer);
	
	Mono<CreditData> save(CreditData creditData);
	
	Mono<CreditData> findById(String id);
}
