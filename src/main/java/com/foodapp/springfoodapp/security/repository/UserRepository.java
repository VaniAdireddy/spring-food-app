package com.foodapp.springfoodapp.security.repository;

import com.foodapp.springfoodapp.security.Modual.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);


//
//	public List<User> getPenddingRestaurantOwners();
//
//	public User findByEmail(String username);

}
