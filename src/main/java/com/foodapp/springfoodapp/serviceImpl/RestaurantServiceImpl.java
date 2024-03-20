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
    public List<Restaurant> saveRestaurants(List<Restaurant> restaurants) {
        return restaurantRepo.saveAll(restaurants);
    }

    @Override
    public List<Restaurant> getAllRestants() {
        return restaurantRepo.findAll();
    }

    @Override
    public Restaurant addRestaurant(Restaurant restaurant) {
        return restaurantRepo.save(restaurant);
    }

    @Override
    public Restaurant updateRestaurant(Restaurant restaurant,Integer id) {
        Restaurant existRestaurant = restaurantRepo.findById(restaurant.getRestaurantId())
                .orElseThrow(() -> new RuntimeException("OOPS there is no restaurant"));

        existRestaurant.setRestaurantName(restaurant.getRestaurantName());
        existRestaurant.setContactNumber(restaurant.getContactNumber());
        existRestaurant.setManagerName(restaurant.getManagerName());
        return restaurantRepo.save(existRestaurant);
    }

    @Override
    public String deleterestaurant(Integer restaurantId) {
        restaurantRepo.deleteById(restaurantId);
        return "delete SuccessFull!";
    }

    @Override
    public Restaurant findManagerName(String managerName) {
        return restaurantRepo.managerName(managerName);
    }
}
