package com.foodapp.springfoodapp.service;


import com.foodapp.springfoodapp.entiry.Address;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressServices {
    

    Address updateAddress(Address updateAddress,int id);
    List<Address> saveAddress(List<Address> addresses);

    Address save(Address address);

    List<Address> getAll();

    Address findByAddressId(Integer id);

    String deleteAddress(int addressId);

//    Address findByPinCode(int pinCode);


    Address findByCity(String city);
}
