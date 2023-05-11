package com.project.room_bookin.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.room_bookin.beans.SignUp;


@Service
public class SignUpService {
	
	@Autowired(required=true)
	private SingInService signInService;

	//private static Map<Long, SignUp> signUp = new HashMap();
	static ArrayList<SignUp> signUp = new ArrayList<SignUp>();
	private static Long index = 2L;

	static {
		SignUp signUp1 = new SignUp(1l, "aaa@gmail.com", (double) 111111L, "EE111111", "1234567890", "1234567890");
		SignUp signUp2 = new SignUp(2l, "bbb@gmail.com", (double) 222222L, "EE222222", "0234567890", "0234567890");
		signUp.add(signUp1);//put(1l, singUp1);
		signUp.add(signUp2);//put(2l, singUp2);

	}
	
	public  List<SignUp> getAllSignUpDetails()
	{
		
		return signUp;
	}
	
	
	
	
	
	
	
	public  SignUp addSignUpDetails(SignUp signUp)
	{
		index +=1;
		signUp.setId(index);
		SignUpService.signUp.add(signUp);
		
		signInService.logInCredentials(signUp);
		
		return signUp;
		
	}
	
	public  String deleteSignUpDetails(Long id)
	{
		for(SignUp sign : signUp)
		{
			if(sign.getId()==id)
			{
				signUp.remove(sign);
				return "Successfully Removed";
			}
		}
		return "User does not exist";
		
		
	}

}
