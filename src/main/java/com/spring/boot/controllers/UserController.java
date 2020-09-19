package com.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.entities.User;
import com.spring.boot.services.UserService;

@RestController
@RequestMapping(value="api/v1")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping(value="/user")
	public ResponseEntity<Object> addUser(@RequestBody User user){
		userService.addUser(user);
		return new ResponseEntity<Object>("Added SuccessFully", HttpStatus.CREATED);
	}
	
	@GetMapping(value="/user")
	public ResponseEntity<Object> getUser(){
		return new ResponseEntity<Object>(userService.getUser(), HttpStatus.OK);
	}
	
	@DeleteMapping(value="/user/{id}")
	public ResponseEntity<Object> deleteUser(@PathVariable Long id){
		userService.deleteUser(id);
		return new ResponseEntity<Object>("Deleted Successfully", HttpStatus.OK);
	}
	
	@PutMapping(value="/user")
	public ResponseEntity<Object> updateUser(@RequestBody User user){
		userService.updateUser(user);
		return new ResponseEntity<Object>("Updated SuccessFully", HttpStatus.OK);
	}
	
	@GetMapping(value="/user/{id}")
	public ResponseEntity<Object> getUserById(@PathVariable Long id){
		return new ResponseEntity<Object>(userService.getUserById(id), HttpStatus.OK);
	}
}
