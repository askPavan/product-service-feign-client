package com.ms.feign.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.feign.endpoints.ProductService;

@RestController
@RequestMapping("/api/store")
public class StoreController {

	@Autowired
	private ProductService productService;

	@GetMapping("/fetch/{productNo}")
	public ResponseEntity<String> fetchProducts(@PathVariable("productNo") int productNo) {
		return productService.getProducts(productNo);
	}
}
