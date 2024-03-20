package com.foodapp.springfoodapp.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RestaurantDto {
	public Integer restaurantId;
	public String restaurantName;
	public String managerName;
	public String contactNumber;
}
