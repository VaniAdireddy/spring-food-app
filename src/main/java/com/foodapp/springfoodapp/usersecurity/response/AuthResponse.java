package com.foodapp.springfoodapp.usersecurity.response;


import com.foodapp.springfoodapp.usersecurity.enums.USER_ROLE;
import lombok.Data;

@Data
public class AuthResponse {
	
	private String message;
	private String jwt;
	private USER_ROLE role;
	


}
