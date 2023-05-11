package com.project.room_bookin.beans;

public class SignUp {

	private Long id;
	private String emailId;
	private Double mobileNo;
	private String userName;
	private String password;
	private String confirmPassword;

	public SignUp(Long id, String emailId, Double mobileNo, String userName, String password, String confirmPassword) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.userName = userName;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "SignUp [id=" + id + ", emailId=" + emailId + ", mobileNo=" + mobileNo + ", userName=" + userName
				+ ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Double getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Double mobileNo) {
		this.mobileNo = mobileNo;
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

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

}
