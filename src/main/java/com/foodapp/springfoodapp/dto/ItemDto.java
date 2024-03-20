package com.foodapp.springfoodapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ItemDto {
	public Integer itemId;
	public String itemName;
	public Integer quantity;
	public Double cost;
}
