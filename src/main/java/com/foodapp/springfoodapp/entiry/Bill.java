package com.foodapp.springfoodapp.entiry;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Bill {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Integer billId;
    @DateTimeFormat
    public LocalDateTime billDate;
    public Double totalCost;
    public int totalItem;

    @OneToOne(cascade = CascadeType.ALL)
    public OrderDetails order;

}