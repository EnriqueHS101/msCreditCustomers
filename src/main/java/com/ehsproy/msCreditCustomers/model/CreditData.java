package com.ehsproy.msCreditCustomers.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("CreditData")
public class CreditData {

	@Id
	private String id;
	private String idProduct;
	private String idCustomer;
	private String numAccount;
	private LocalDate dateOpening;
	private String amount;
	private Double balance;
	private String numTarget;
	
}
