package com.ehsproy.msCreditCustomers.service.impl;

import org.springframework.stereotype.Service;

import com.ehsproy.msCreditCustomers.model.CreditData;
import com.ehsproy.msCreditCustomers.repository.ICreditDataRepository;
import com.ehsproy.msCreditCustomers.service.ICreditDataService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CreditDataServiceImpl implements ICreditDataService {

private final ICreditDataRepository creditRepo;

	
	public Flux<CreditData> findByIdCustomer(String idCustomer) {
		return creditRepo.findByIdCustomer(idCustomer);
	}


	public Mono<CreditData> save(CreditData creditData) {
		return creditRepo.save(creditData);
	}


	public Mono<CreditData> findById(String id) {
		return creditRepo.findById(id);
	}
}
