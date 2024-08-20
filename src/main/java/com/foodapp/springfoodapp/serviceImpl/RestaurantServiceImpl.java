package com.foodapp.springfoodapp.serviceImpl;


import com.foodapp.springfoodapp.entiry.Restaurant;
import com.foodapp.springfoodapp.repository.RestaurantRepo;
import com.foodapp.springfoodapp.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {
    private final RestaurantRepo restaurantRepo;

    @Override
    public Restaurant addRestaurant(Restaurant restaurant) {
        return restaurantRepo.save(restaurant);
    }

    @Override
    public List<Restaurant> saveRestaurants(List<Restaurant> restaurants) {
        return restaurantRepo.saveAll(restaurants);
    }

    @Override
    public List<Restaurant> getAllRestants() {
        return restaurantRepo.findAll();
    }


    @Override
    public String deleterestaurant(int restaurantId) {
        restaurantRepo.deleteById(restaurantId);
        return "delete SuccessFull!";
    }

    @Override
    public Restaurant findManagerName(String managerName) {
        return restaurantRepo.managerName(managerName);
    }

    @Override
    public Restaurant updateRestaurant(Restaurant restaurant, int id) {
        var exits = restaurantRepo.findById(restaurant.getRestaurantId())
                .orElseThrow(() -> new IllegalArgumentException("There iss no Id Please Create"));

        if (exits.getManagerName() != null) {
            exits.setManagerName(restaurant.getManagerName());
        }

        if (exits.getContactNumber() != null) {
            exits.setContactNumber(restaurant.getContactNumber());
        }

        if (exits.getRestaurantName() != null) {
            exits.setRestaurantName(restaurant.getRestaurantName());
        }

        restaurantRepo.save(exits);
        return exits;
    }


}
