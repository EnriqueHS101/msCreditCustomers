package com.ehsproy.msCreditCustomers.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.ehsproy.msCreditCustomers.model.CreditData;

import reactor.core.publisher.Flux;

public interface ICreditDataRepository extends ReactiveCrudRepository<CreditData,String> {

	Flux<CreditData> findByIdCustomer(String idCustomer);
}
