package com.foodapp.springfoodapp.serviceImpl;



import com.foodapp.springfoodapp.entiry.FoodCart;
import com.foodapp.springfoodapp.repository.FoodCartRepo;
import com.foodapp.springfoodapp.service.FoodCartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodCartServiceImpl implements FoodCartService {

    private final FoodCartRepo cartRepo;

    @Override
    public List<FoodCart> savefoods(List<FoodCart> foodCarts) {
        return cartRepo.saveAll(foodCarts);
    }

    @Override
    public List<FoodCart> getfood() {
        return cartRepo.findAll();
    }

    @Override
    public FoodCart savecart(FoodCart foodCart) {
        return cartRepo.save(foodCart);
    }

    @Override
    public String deleteId(Integer cartId) {
        cartRepo.deleteById(cartId);
        return "cart id deleted";
    }

    @Override
    public FoodCart updateFoodCartId(FoodCart foodCart, Integer id) {
        FoodCart existingCart = cartRepo.findById(foodCart.getCartId())
                .orElseThrow(() -> new RuntimeException("not Found"));
//        FoodCart existingCart1 = cartRepo.findById(id).orElse(null);

        existingCart.setCategoryName(foodCart.categoryName);
        return cartRepo.save(existingCart);
    }


}
