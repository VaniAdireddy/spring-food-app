package com.foodapp.springfoodapp.entiry;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Bill {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer billId;
    private LocalDateTime billDate;
    private Double totalCost;
    private Integer totalItem;


    @OneToOne(cascade = CascadeType.ALL)
    private OrderDetails order;

}