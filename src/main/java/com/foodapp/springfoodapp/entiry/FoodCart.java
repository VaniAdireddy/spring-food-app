package com.foodapp.springfoodapp.entiry;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "foodcart")
public class FoodCart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cartId;

    private String categoryName;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private Customer customer;


    @OneToMany(targetEntity = Item.class, cascade = CascadeType.ALL)
    private List<Item> itemList;


}