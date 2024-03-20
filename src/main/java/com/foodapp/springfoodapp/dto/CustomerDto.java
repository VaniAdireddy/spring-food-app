package com.foodapp.springfoodapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomerDto {
	public Integer customerId;
	public String fullName;
	public Integer age;
	public String gender;
	public String mobileNumber;
	public String email;
}
