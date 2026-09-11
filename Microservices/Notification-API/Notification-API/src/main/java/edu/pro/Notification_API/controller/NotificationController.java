package edu.pro.Notification_API.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

	@Autowired
	private ProductAPI productAPI;
	
	
	@GetMapping("/notification")
	public String notification() {
		return "Email Sent to user";
	}
	
	@GetMapping("/notification/product")
	public String getProduct() {
		String s2 = productAPI.invokeProductAPI();
		return s2;
	}
	
	
}
