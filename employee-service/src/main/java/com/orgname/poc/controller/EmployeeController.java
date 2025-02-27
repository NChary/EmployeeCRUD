package com.orgname.poc.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.orgname.poc.model.FacebookRegistration;
import com.orgname.poc.service.FacebookRegisterService;

@RestController
public class EmployeeController {

	// Creating an object of Service class
	@Autowired
	private FacebookRegisterService facebookRegisterService;
	
	@GetMapping("/greet")
	public String greet() {
		return "Welcome to RESTFul API";
	}
	
	public String display() {
		return "";
	}
	
	@PostMapping("/fbregister")
	public String register(@RequestBody FacebookRegistration facebookRegistration) {
		return facebookRegisterService.register(facebookRegistration);
	}
	
	@GetMapping("/fbregister")
	public List<FacebookRegistration> fetchAll(){
		return facebookRegisterService.getAll();
	}
	
	@PutMapping("/fbregister")
	public String updateDetails(@RequestBody FacebookRegistration facebookRegistration) {
		return facebookRegisterService.updateDetails(facebookRegistration);
	}
	
	@DeleteMapping("/fbregister")
	public String deleteDetails(@RequestBody FacebookRegistration facebookRegistration) {
		return facebookRegisterService.deleteDetails(facebookRegistration);
	}
	
}
