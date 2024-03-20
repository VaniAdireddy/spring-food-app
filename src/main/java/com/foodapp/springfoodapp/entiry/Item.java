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
	private int itemId;
	private String itemName;
	private Integer quantity;
	private Double cost;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Category category;
}