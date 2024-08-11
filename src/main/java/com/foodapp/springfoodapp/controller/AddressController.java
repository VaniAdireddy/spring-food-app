package com.foodapp.springfoodapp.controller;

import com.foodapp.springfoodapp.entiry.Address;
import com.foodapp.springfoodapp.request.CreateAddress;
import com.foodapp.springfoodapp.service.AddressServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/address")
public class AddressController {
    private final AddressServices addressServices;
//    @RequestHeader("Authorization") String jwt


    @PostMapping("/save")
    public Address saveAddress(@RequestBody Address address){
        return addressServices.save(address);
    }
    @PostMapping("/add/list/address")
    public List<Address> saveAddress(@RequestBody List<Address> addresses) {
        return addressServices.saveAddress(addresses);
    }

    @GetMapping("/get")
    public List<Address> findAllAddress() {
        return addressServices.getAddress();
    }

    @DeleteMapping("/delete/{addressId}")
    public String deleteBill(@PathVariable int addressId) {
        return addressServices.deleteAddress(addressId);
    }

    @PutMapping("/update/{id}")
    public Address updateAddress(@RequestBody Address updateAddress) {
        return addressServices.updateAddress(updateAddress);
    }

    @GetMapping("/findCity/{city}")
    public Address findByAddressCity(@PathVariable String city) {
        return addressServices.findByCity(city);
    }
//
//    @PostMapping("/findByPinCode/{pinCode}")
//    public Address findByPinCode (@PathVariable String pinCode){
//        return addressServices.findByPinCode(pinCode);
//    }


}