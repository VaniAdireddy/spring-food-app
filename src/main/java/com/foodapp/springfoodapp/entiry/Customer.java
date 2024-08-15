package com.foodapp.springfoodapp.entiry;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int customerId;
    @Column(name = "FullName")
    @Size(min = 5,max = 25)
    public String fullName;
    public Integer age;
    public String gender;
    public String mobileNumber;
    @Email
    @Column(unique = true)
    public String email;

    @OneToOne(cascade = CascadeType.ALL)
    public Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    public FoodCart foodCart;
}

