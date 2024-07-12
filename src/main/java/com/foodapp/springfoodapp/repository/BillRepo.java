package com.foodapp.springfoodapp.repository;

import com.foodapp.springfoodapp.entiry.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepo extends JpaRepository<Bill,Integer> {
}

