package edu.pro.SecurityApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/addUsers")
	public String addUsers(@RequestBody UserListRequest request) {
		service.saveUsers(request.getUsers());
		return "Users added Successfully....";
	}
	
	@GetMapping("/public")
	public String publicMethod() {
		return "This is Public method ... ";
	}
	
	@GetMapping("/admin")
	public String adminMethod() {
		return "This is Admin method ... ";
	}
	
	@GetMapping("/user")
	public String userMethod() {
		return "This is User method ... ";
	}
}
