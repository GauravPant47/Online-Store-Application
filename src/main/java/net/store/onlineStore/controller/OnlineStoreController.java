package net.store.onlineStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.store.onlineStore.model.CustomerModel;
import net.store.onlineStore.model.ProductModel;
//import net.store.onlineStore.repository.CustomerRepository;
import net.store.onlineStore.repository.ProductRepository;

@RestController
public class OnlineStoreController {
	
	@Autowired
	private ProductRepository productRepository; 
//	@Autowired
//	private CustomerRepository customerRepository;
	
	@PostMapping("/product")
	public ProductModel getByProduct(@RequestBody CustomerModel customerModel) {
		ProductModel prodModel = productRepository.findByCustomerId(customerModel.getcustomerId());
		return prodModel;
	}
	
	
//	@PostMapping("/customer")
//	public CustomerModel getByCustomer(@RequestBody CustomerModel customerModel) {
//		CustomerModel cusmodel = customerRepository.fineByCustomerID(customerModel.getCustmerId());
//		return cusmodel;
//	}
	
	
	
	
	
}
