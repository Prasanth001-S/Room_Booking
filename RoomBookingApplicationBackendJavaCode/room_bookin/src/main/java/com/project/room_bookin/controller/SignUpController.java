package com.project.room_bookin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.room_bookin.beans.SignUp;
import com.project.room_bookin.service.SignUpService;

@RestController
public class SignUpController {

	@Autowired(required = true)
	private SignUpService signUpService;

	@GetMapping(path = "/getAllSingUpDetails")
	public List<SignUp> getAllSingUpDetails() {
		return signUpService.getAllSignUpDetails();
	}

	@PostMapping(path = "/addSignUp")
	public ResponseEntity<SignUp> addSignUp(@RequestBody SignUp signUp) {
		return new ResponseEntity<SignUp>(signUpService.addSignUpDetails(signUp), HttpStatus.ACCEPTED);

	}

	@DeleteMapping(path = "/deleteSignUp/{id}")
	public ResponseEntity<String> deleteSignUp(@PathVariable Long id) {
		return new ResponseEntity<String>(signUpService.deleteSignUpDetails(id), HttpStatus.ACCEPTED);
	}

}
