package com.foodapp.springfoodapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderDto {
	public Integer orderId;
	public LocalDateTime orderDate;
	public String orderStatus;
}
