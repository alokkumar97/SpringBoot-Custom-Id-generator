package com.ait.SBCIG.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ait.SBCIG.model.UserEntity;
import com.ait.SBCIG.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepo;
	
	@PostMapping("/save")
	public ResponseEntity<?> saveUser(@RequestBody UserEntity user){
		UserEntity entity = userRepo.save(user);
		System.out.println("User saved :"+entity);
		return  ResponseEntity.ok("Saved");
	}
}
