package com.foodapp.springfoodapp.controller;

import com.foodapp.springfoodapp.dto.AddressDto;
import com.foodapp.springfoodapp.entiry.Address;
import com.foodapp.springfoodapp.entiry.Bill;
import com.foodapp.springfoodapp.entiry.Customer;
import com.foodapp.springfoodapp.service.AddressServices;
import com.foodapp.springfoodapp.usersecurity.modual.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/address")
public class AddressController {
    private AddressServices addressServices;


    @PostMapping
    public ResponseEntity<Address>saveSingleAddress(@RequestBody Address address){

        return ResponseEntity.ok().body(addressServices.saveSingleAdress(address));
    }
    @PostMapping("/add/list/address")
    public List<Address> saveAddress(@RequestBody List<Address> addresses) {
        return addressServices.saveAddress(addresses);
    }

    @GetMapping("/get")
    public List<Address> findAllAddress() {
        return addressServices.getAddress();
    }

    @GetMapping("/addressFindById{addressId}")
    public Optional<Address> findAddressByName(@PathVariable("addressId") int addressId) {
        return addressServices.getById(addressId);
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