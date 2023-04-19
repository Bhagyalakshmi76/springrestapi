package com.restapicrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapicrud.model.User;
import com.restapicrud.service.AppService;

@RestController
public class AppController {

	@Autowired
	private AppService appService;
	
	
	@PostMapping("/save")
	public Object saveNewUser(@RequestBody User user) {
		 
		return appService.saveUser(user);
	}
	
	@GetMapping("/retrive")
	public Object getUserById(@PathVariable("id") int id) {
		 
		return appService.getById(id);
	}
	
	@DeleteMapping("/delete")
	public Object deleteUserId(@PathVariable("id") int id) {
		 
		return appService.deleteUserId(id);
		 
	}
	@PutMapping("/update")
	public Object updateById(@PathVariable("id") int id,@RequestBody User updateUser) {
		return appService.updateById(id,updateUser);
}
}


