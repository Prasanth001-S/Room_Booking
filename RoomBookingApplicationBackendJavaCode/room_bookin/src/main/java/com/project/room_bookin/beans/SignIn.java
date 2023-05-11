package com.project.room_bookin.beans;

public class SignIn {
	
	private Long id;
	private String userName;
	private String password;
	
	public SignIn(Long id, String userName, String password) 
	{
		
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
	
	
	


	public SignIn() {
		// TODO Auto-generated constructor stub
	}





	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "SignIn [id=" + id + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
	
	
	

}
