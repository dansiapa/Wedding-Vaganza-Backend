package com.weddingapps.weddingvaganza;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public GetUserModel createUsers(@RequestParam String userNama, @RequestParam String pasanganUser, @RequestParam String userEmail
			,@RequestParam String userPassword, @RequestParam String tglPernikahan, @RequestParam int nomorHPUser) {
		GetUserModel getUserModelist = new GetUserModel();
		UserModel userModel = userService.createUser(userNama, pasanganUser, userEmail, userPassword
				, tglPernikahan, nomorHPUser);
		if (Objects.nonNull(userModel)) {
			getUserModelist.setStatus("Success");
			getUserModelist.setUserModels(userModel);
			return getUserModelist;
		} else {
			getUserModelist.setStatus("Failed");
			return getUserModelist;
		}
	}
	@GetMapping("/login")
	public GetUserModel login(@RequestParam String userEmail, @RequestParam String userPassword) {
		GetUserModel getUserModelist = new GetUserModel();
		if (userService.login(userEmail, userPassword)) {
			getUserModelist.setStatus("Success");
			getUserModelist.setUserModels(getUserByEmail(userEmail));
			return getUserModelist;
		} else {
			getUserModelist.setStatus("Failed");
			return getUserModelist;
		}
		
	}
	
	@GetMapping("/user/{email}")
	public UserModel getUserByEmail(@PathVariable String userEmail) {
		return userService.getUsersByEmail(userEmail);
	}
	
	@GetMapping("/user/all")
	public Iterable<UserModel> getAllUser(){
		return userService.getAllUser();
	}
}
