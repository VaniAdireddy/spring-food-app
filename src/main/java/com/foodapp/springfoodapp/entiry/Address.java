package com.foodapp.springfoodapp.entiry;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
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
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public int addressId;
    @Size(min = 7,max = 40)
    public String area;
    @Size(min = 7,max = 40)
    public String city;
    public String state;
    public String country;
    @Column(nullable = false,unique = true)
    public String pinCode;
}

