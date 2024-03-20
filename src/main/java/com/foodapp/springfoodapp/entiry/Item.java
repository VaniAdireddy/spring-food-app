package com.foodapp.springfoodapp.entiry;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="item")
@Entity
public class Item{
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	public int itemId;
	public String itemName;
	public Integer quantity;
	public Double cost;
	
//	@Embedded
	@OneToOne(cascade = CascadeType.ALL)
	public Category category;
}