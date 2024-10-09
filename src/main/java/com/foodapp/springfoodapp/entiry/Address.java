package com.foodapp.springfoodapp.entiry;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int addressId;
//    @Min(5)
//    @Max(10)
//    @NotNull(message = "shouldn't be Null Area")
    public String area;
    @NotNull(message = "shouldn't be Null City")
    public String city;
    @NotNull(message = "shouldn't be Null State")
    public String state;
    @NotNull(message = "shouldn't be Null Country")
    public String country;
    @Column(nullable = false, unique = true)
//    @Min(6)
    public String pinCode;
}

