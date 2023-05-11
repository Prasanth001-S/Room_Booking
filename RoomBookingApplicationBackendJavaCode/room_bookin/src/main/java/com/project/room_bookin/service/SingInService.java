package com.project.room_bookin.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.room_bookin.beans.SignIn;
import com.project.room_bookin.beans.SignUp;


@Service
public class SingInService {

	private static ArrayList<SignIn> signIn = new ArrayList<SignIn>();
	private static Long index = 2L;

	static {
		SignIn signIn1 = new SignIn(1L, "EE111111", "1234567890");
		SignIn signIn2 = new SignIn(2L, "EE222222", "1234567890");
		signIn.add(signIn1);
		signIn.add(signIn2);

	}

	public static List<SignIn> getAllSignInDetails() 
	{
		return signIn;
	}

	
	
	public  SignIn addSignIn(SignIn singIn) {
		index += 1;
		
		singIn.setId(index);
		signIn.add(singIn);
		
		return singIn;
		
	}
	
	
	
	public  String logInCredentials(SignUp signUp)
	{
		
		index +=1;
		
		SignIn sign = new SignIn();
		
		sign.setId(signUp.getId());
		sign.setUserName(signUp.getUserName());
		sign.setPassword(signUp.getPassword());
		
		signIn.add(sign);
		
		return "Successfully LogIn";
	}
	
	
	//while SignIn it will return Successfull  message 
	public static SignIn logInMessage(SignIn in)
	{
		
		if(signIn.contains(in))
		{
			return in;
		}
		
		SignIn signIn=new SignIn();
		
		signIn.setId(null);
		signIn.setUserName("Check you Username");
		signIn.setPassword("Check your Password");
		
		return signIn;
	}

	public String deleteSingIn(Long id) {
		
		for(SignIn sign : signIn )
		{
			if(sign.getId()==id)
			{
				signIn.remove(sign);
				return "Removed Successfully";
			}
		}
		return "User Credentials Not Found";
	}

}
