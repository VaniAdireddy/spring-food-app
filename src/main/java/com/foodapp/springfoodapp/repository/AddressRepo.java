package com.foodapp.springfoodapp.repository;

import com.foodapp.springfoodapp.entiry.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {
    Address findByCity(String city);

//    @Query("select a from Address a")
//    List<Address>getAllAddressByQuery();

}
