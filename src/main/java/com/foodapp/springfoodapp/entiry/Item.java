package com.foodapp.springfoodapp.entiry;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "item")
@Entity
public class Item {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int itemId;
    @NotNull(message = "should not be Null  ")
    public String itemName;
    @NotNull
    public Integer quantity;
    @NotNull
    public Double cost;

    //	@OneToOne(cascade = CascadeType.ALL)
//	@JsonIgnore //todo it will ignore in DB
//	public Category category;
}