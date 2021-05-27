package com.ust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.model.Customer;

@RestController
public class CustomerController {
	
	@Autowired
	Customer customer;
	
	@RequestMapping("/customer")
	public String getCustomerDetails() {
		return "  Customer ID :   "+customer.getId() +
			   "  Customer Name : "+customer.getName()+
			   "  Cusotmer Address : "+customer.getAddress()+
			   "  Customer Bill Amount : "+customer.getBillamount();
	}

}
