package com.app;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
	
	@GetMapping("/getUser")
	public String getUser() {
		return "Get user was called ";
		
	}
	
	@PostMapping()
	public String postUser() {
		return "Post user was called ";
	}
	

	@PutMapping()
	public String putUser() {
		return "Put user was called ";
	}
	
	@DeleteMapping()
	public String deleteUser() {
		return "Delete user was called ";
	}

}