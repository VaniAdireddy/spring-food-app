package com.foodapp.springfoodapp.repository;

import com.foodapp.springfoodapp.entiry.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.tags.form.SelectTag;

import java.util.List;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

    //    @Query("SELECT a FROM address a WHERE a.city =: city")
    Address findByCity(String city);

    
//    @Query("SELECT a FROM address a WHERE a.pinCode =: pinCode ")
//    Address findByPinCode(@RequestParam int pinCode);
}
