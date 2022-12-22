package com.ms.feign.endpoints;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "eureka-discovery-client-app")
public interface ProductService {
	@GetMapping(value = "/api/products/{productNo}",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getProducts(@PathVariable("productNo") int productNo);
}
