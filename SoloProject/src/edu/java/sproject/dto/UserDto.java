package edu.java.sproject.dto;

import java.util.Date;

public class UserDto {

	private String userId;
	private String userPw;
	private String userPwCheck;
	private String userName;
	private String userEmail;
	private String userAddress;
	private int userPhone;
	private Date userBirthday;
	
	public UserDto() {
		// TODO Auto-generated constructor stub
	}

	public UserDto(String userId, String userPw, String userPwCheck, String userName, String email, String address,
			int phone, Date birthday) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userPwCheck = userPwCheck;
		this.userName = userName;
		this.userEmail = email;
		this.userAddress = address;
		this.userPhone = phone;
		this.userBirthday = birthday;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserPwCheck() {
		return userPwCheck;
	}

	public void setUserPwCheck(String userPwCheck) {
		this.userPwCheck = userPwCheck;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return userEmail;
	}

	public void setEmail(String email) {
		this.userEmail = email;
	}

	public String getAddress() {
		return userAddress;
	}

	public void setAddress(String address) {
		this.userAddress = address;
	}

	public int getPhone() {
		return userPhone;
	}

	public void setPhone(int phone) {
		this.userPhone = phone;
	}

	public Date getBirthday() {
		return userBirthday;
	}

	public void setBirthday(Date birthday) {
		this.userBirthday = birthday;
	}

	
	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", userPw=" + userPw + ", userPwCheck=" + userPwCheck + ", userName="
				+ userName + ", email=" + userEmail + ", address=" + userAddress + ", phone=" + userPhone + ", birthday=" + userBirthday
				+ "]";
	}
	
	
	
	
	
	
}
