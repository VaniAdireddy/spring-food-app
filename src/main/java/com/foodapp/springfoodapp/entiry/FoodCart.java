package com.foodapp.springfoodapp.entiry;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "foodcart")
public class FoodCart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer cartId;

    public String cartName;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    public Customer customer;


    @OneToMany(targetEntity = Item.class, cascade = CascadeType.ALL)
    public List<Item> itemList;


}