package com.foodapp.springfoodapp.service;


import com.foodapp.springfoodapp.entiry.Address;
import com.foodapp.springfoodapp.entiry.Customer;
import com.foodapp.springfoodapp.request.CreateAddress;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AddressServices {


    List<Address> saveAddress(List<Address> addresses);

    List<Address> getAddress();

   

    String deleteAddress(int addressId);

    Address updateAddress(Address updateAddress);

    Address findByCity(String city);


    Address save(Address address);

}
