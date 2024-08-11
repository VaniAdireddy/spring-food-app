package com.foodapp.springfoodapp.usersecurity.request;

import lombok.Data;

@Data
public class ResetPasswordRequest {
	
	private String password;
	private String token;


}
