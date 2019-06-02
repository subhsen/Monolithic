package com.mono.controller.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mono.entity.Customer;
import com.mono.service.CustomerService;

@RestController
public class PostCustomerController {

	@Autowired
	private CustomerService customerService;
	
//	@PostMapping("/api/v1.0/save/customer/order")
//	public ResponseEntity<Customer> saveCustomer(){
//		
//		Customer customer = buildCustomer();
//		
//		Customer cust = customerService.saveCustomer(customer);
//		
//		return new ResponseEntity<Customer>(cust, HttpStatus.OK);
//	}
	
	
	@PostMapping("/api/v1.0/save/customer/order")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
		
		//Customer customer = buildCustomer();
		
		Customer cust = customerService.saveCustomer(customer);
		
		return new ResponseEntity<Customer>(cust, HttpStatus.OK);
	}

	
//	private Customer buildCustomer() {
//		
//		Customer customer = new Customer("First Customer", "987654321");
//		
//		Orders order = new Orders();
//		order.setOrderName("First OrderName");
//		
//		Product product = buildProduct();
//		
//		order.addProduct(product);
//		
//		//List<Product> productList = buildProductList();
//		
//		//order.setProductList(productList);
//		
//		customer.addOrder(order);
//		
//		return customer;
//	}
//
//	private Product buildProduct() {
//		
//		//List<Product> prodList = new ArrayList<>();
//		
//		Product product1 = new Product("Mobile", "iPhone 8");
//		product1.setPrice(new Price(80000D, 10D));
//				
////		Product product2 = new Product("TV", "LG Led 40 TV");
////		product2.setPrice(new Price(30000D, 10D));
//		
//	//	prodList.add(product1);
//		//prodList.add(product2);
//		
//		return product1;
//	}
}
