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

import com.project.room_bookin.beans.SignIn;
import com.project.room_bookin.service.SingInService;

@RestController
public class SignInController {

	@Autowired(required = true)
	private SingInService signInService;

	@GetMapping(path = "/getAllSingInDetails")
	public List<SignIn> getAllSingInDetails() {
		return signInService.getAllSignInDetails();
	}

	@PostMapping(path = "/addSignIn")
	public ResponseEntity<SignIn> addSignIn(@RequestBody SignIn signIn) {
		return new ResponseEntity<SignIn>(signInService.addSignIn(signIn), HttpStatus.ACCEPTED);

	}

	public ResponseEntity<SignIn> logInMessage(SignIn signIn) {
		return new ResponseEntity<SignIn>(signInService.logInMessage(signIn), HttpStatus.OK);
	}

	@DeleteMapping(path = "/deleteSignIn/{id}")
	public ResponseEntity<String> deleteSignIn(@PathVariable(name = "id") Long id) {

		return new ResponseEntity<String>(signInService.deleteSingIn(id), HttpStatus.ACCEPTED);
	}

}
