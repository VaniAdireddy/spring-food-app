package com.foodapp.springfoodapp.entiry;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int customerId;
    @Column(name = "FullName")
    @Size(min = 5, max = 25)
    public String fullName;
    @Min(18)
    @Max(65)
    public Integer age;
    public String gender;
    public String mobileNumber;
    @Email(message = "Email Must be Filed")
    @Column(unique = true)
    public String email;

    @OneToOne(cascade = CascadeType.ALL)
    public Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    public FoodCart foodCart;
}

