package com.mono.controller.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mono.entity.Customer;
import com.mono.service.CustomerService;

@RestController
public class GetCustomerController {

	@Autowired CustomerService customerService;
	
	@GetMapping("/api/v1.0/get/customerorder/{id}")
	public ResponseEntity<Customer> getCustomerById(@RequestParam(name="id") String id){
		
		Long longId = new Long(id);
		Customer customer = customerService.findCustomerById(longId);
		
		return new ResponseEntity(customer, HttpStatus.OK);
	}
}
