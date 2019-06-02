package com.mono.service;

import org.springframework.stereotype.Service;

import com.mono.entity.Customer;

@Service
public interface CustomerService {

	Customer saveCustomer(Customer customer);
	
	Customer findCustomerById(Long id);
}
