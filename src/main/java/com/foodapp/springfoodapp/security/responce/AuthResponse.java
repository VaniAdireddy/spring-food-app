package com.foodapp.springfoodapp.security.responce;


import com.foodapp.springfoodapp.security.Modual.USER_ROLE;
import lombok.Data;

@Data
public class AuthResponse {
	
	private String message;
	private String jwt;
	private USER_ROLE role;

}
