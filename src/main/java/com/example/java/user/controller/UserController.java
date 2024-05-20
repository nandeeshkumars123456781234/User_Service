package com.example.java.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.java.user.entity.User;
import com.example.java.user.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@PostMapping("/saveuser")
	public ResponseEntity<User> saveUser(@RequestBody User user) {

		User user1 = userRepository.save(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);

	}

	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUser() {

		List<User> users = userRepository.findAll();
		return ResponseEntity.ok(users);

	}

	@GetMapping("/users/{userId}")
	public ResponseEntity<Optional<User>> getUserById(@PathVariable Long userId) {

		Optional<User> users = userRepository.findById(userId);
		return ResponseEntity.ok(users);

	}

}
