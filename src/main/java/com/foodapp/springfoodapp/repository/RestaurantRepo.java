package com.foodapp.springfoodapp.repository;

import com.foodapp.springfoodapp.entiry.Restaurant;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant, Integer> {
    Restaurant managerName(String managerName);

//    @Query ("select r from Restaurant r")
//    List<Restaurant> quaryList();
}
