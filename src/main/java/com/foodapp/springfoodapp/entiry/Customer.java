package com.foodapp.springfoodapp.entiry;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int customerId;

	private String fullName;
	private Integer age;
	private String gender;
	private String mobileNumber;
	private String email;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JsonIgnore
//	private FoodCart foodCart;
}

