package com.nissan.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Apply;
import com.nissan.model.Feedback;
import com.nissan.model.Help;
import com.nissan.model.LoanType;
import com.nissan.model.Role;
import com.nissan.model.User;
import com.nissan.service.IUserService;


@CrossOrigin		//helps to avoid CORS error
@RestController
@RequestMapping("api/")
public class UserController {

//field DI Injection
	@Autowired
	IUserService userService;
	
	//List all users
		@GetMapping("users")
		public List<User> getAllUsers(){
			return userService.getAllUsers();
		}
		
		@GetMapping("roles")
		public List<Role> findAllRoles(){
			return userService.findAllRoles();
		}
		
		@GetMapping("feedbacks")
		public List<Feedback> getAllFeedbacks(){
			return userService.getAllFeedbacks();
		}
		
		@GetMapping("helps")
		public List<Help> getAllHelps(){
			return userService.getAllHelps();
		}
		
		@GetMapping("applies")
		public List<Apply> getAllAppls(){
			return userService.getAllAppls();
		}
		
		@GetMapping("loantypes")
		public List<LoanType> getAllLoanType(){
			return userService.getAllLoanType();
		}
		
		//Add User
		@PostMapping("users")
		public ResponseEntity<User> addUser(@RequestBody User user){
			System.out.println("Inserting a record");
			//return new ResponseEntity<User> (userDetailsService.save(user),HttpStatus.OK);
			return new ResponseEntity<User> (userService.addUser(user),HttpStatus.OK);
		}
		
		//Update User
		@PutMapping("users")
		public User updateUser(@RequestBody User user) {
			System.out.println("Updating a record");
			userService.updateUser(user);
			return user;
		}
		
		
}
