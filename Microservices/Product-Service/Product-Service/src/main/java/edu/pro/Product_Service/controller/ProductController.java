package edu.pro.Product_Service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@GetMapping("/place")
	public String placeOrder() {
		return "Hello Order of S24 Ultra Placed";
	}
}
