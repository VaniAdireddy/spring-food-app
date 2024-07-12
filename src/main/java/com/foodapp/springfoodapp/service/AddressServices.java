package com.foodapp.springfoodapp.service;


import com.foodapp.springfoodapp.entiry.Address;
import com.foodapp.springfoodapp.entiry.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AddressServices {


    List<Address> saveAddress(List<Address> addresses);

    List<Address> getAddress();

    Optional<Address> getById(int addressId);

    String deleteAddress(int addressId);

    Address updateAddress(Address updateAddress);

    Address findByCity(String city);


}
