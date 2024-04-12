package com.project.StarZack.Entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_info")
public class User {
	
	@Id
	private String UserId;
	@NotEmpty(message = "USERNAME SHOULD BE EMPTY")
	@Size(min=5,message="UserName must be min or gretaer than 5")
	@Pattern(regexp="^[A-Za-z\\s]+$")
	private String UserName;
	@Email(message="Email should be valid")
	@Pattern(message = "Invalid email id", regexp = "^.+@.+\\..+$")
	@NotBlank
	private String UserEmail;
//	@Pattern(regexp=)
	@NotBlank
	private String Userpassword;
	@Pattern(regexp = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$",message="Should be numbers only")
	@Size(min=10,max=10,message="phonenumber should be 10 number only ")
	private String UserphoneNo;

	public User() {
	}

	public User(String userId, String userName, String userEmail, String userpassword, String userphoneNo) {
		UserId = userId;
		UserName = userName;
		UserEmail = userEmail;
		Userpassword = userpassword;
		UserphoneNo = userphoneNo;
	}


	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUserEmail() {
		return UserEmail;
	}

	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}

	public String getUserpassword() {
		return Userpassword;
	}

	public void setUserpassword(String userpassword) {
		Userpassword = userpassword;
	}

	public String getUserphoneNo() {
		return UserphoneNo;
	}

	public void setUserphoneNo(String userphoneNo) {
		UserphoneNo = userphoneNo;
	}
}
	


