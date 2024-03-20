package com.foodapp.springfoodapp.repository;

import com.foodapp.springfoodapp.entiry.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant, Integer> {
    Restaurant managerName(String managerName);
}
