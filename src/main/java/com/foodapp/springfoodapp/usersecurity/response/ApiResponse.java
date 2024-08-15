package com.foodapp.springfoodapp.usersecurity.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class ApiResponse {
	
	private String message;
	private boolean status;

}
