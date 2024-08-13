package com.foodapp.springfoodapp.entiry;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "address")
public class Address {
    //todo data layer
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int addressId;
    public String area;
    public String city;
    public String state;
    public String country;
    public String pinCode;
}

