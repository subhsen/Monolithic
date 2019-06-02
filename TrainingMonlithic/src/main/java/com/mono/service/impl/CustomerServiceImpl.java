package com.mono.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mono.entity.Customer;
import com.mono.repository.CustomerRepository;
import com.mono.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer saveCustomer(Customer customer) {
				
		return customerRepository.save(customer);
	}

	@Override
	public Customer findCustomerById(Long id) {
		return customerRepository.findById(id).get();
	}

}
