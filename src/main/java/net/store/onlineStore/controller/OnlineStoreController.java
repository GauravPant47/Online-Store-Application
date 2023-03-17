package net.store.onlineStore.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.store.onlineStore.model.CustomerModel;
import net.store.onlineStore.model.ProductModel;

import net.store.onlineStore.repository.ProductRepository;

@RestController
public class OnlineStoreController {
	
	@Autowired
	private ProductRepository productRepository; 
	
	
	@PostMapping("/product")
	public ProductModel getByProduct(@RequestBody ProductModel productModel) {
		ProductModel prodModel = productRepository.findByCustomerId(productModel.getProductId());
		return prodModel;
	}
	
	
	@PostMapping("/customer")
	public ProductModel getByCustomer(@RequestBody CustomerModel customerModel) {
		ProductModel cusmodel = productRepository.findByCustomerId(customerModel.getCustomerId());
		return cusmodel;
	}
	
	
	
	
	
}
