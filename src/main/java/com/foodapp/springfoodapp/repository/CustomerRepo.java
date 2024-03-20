package com.foodapp.springfoodapp.repository;

import com.foodapp.springfoodapp.entiry.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
    Customer findByEmail(String email);

    Customer findByMobileNumber(String mobileNumber);
}
