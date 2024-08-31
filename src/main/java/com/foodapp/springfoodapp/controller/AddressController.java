package com.foodapp.springfoodapp.controller;

import com.foodapp.springfoodapp.entiry.Address;
import com.foodapp.springfoodapp.exception.UserException;
import com.foodapp.springfoodapp.service.AddressServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/address")
public class AddressController {
//@RequestHeader("Authorization")
//@RequestHeader("Authorization")String jwt

    private final AddressServices addressServices;


    @PostMapping("/add/list/address")
    public ResponseEntity<List<Address>> saveAddress(@RequestBody List<Address> addresses) {
        List<Address> address = addressServices.saveAddress(addresses);
        return new ResponseEntity<>(address, HttpStatus.CREATED);
    }

    @PostMapping("/save")
    public ResponseEntity<Address> saveAddress(@RequestBody Address address) {
        Address saveAddressDemo = addressServices.save(address);
        return new ResponseEntity<>(saveAddressDemo, HttpStatus.CREATED);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<Address>> getAllAddress() {
        List<Address> address = addressServices.getAll();
        return new ResponseEntity<>(address, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Address> findByAddressId(@PathVariable int id) {
        Address address = addressServices.findByAddressId(id);
        return ResponseEntity.ok(address);
    }

    @DeleteMapping("/delete/{addressId}")
    public ResponseEntity<String> deleteBill(@PathVariable int addressId) {
        String deleteAddress = addressServices.deleteAddress(addressId);
        return new ResponseEntity<>(deleteAddress, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Address> updateAddress(@PathVariable int id, @RequestBody Address updateAddress) {
        Address address = addressServices.updateAddress(updateAddress, id);
        return new ResponseEntity<>(address, HttpStatus.OK);
    }

    @GetMapping("/findCity/{city}")
    public ResponseEntity<Address> findByAddressCity(@PathVariable String city) throws UserException {
        Address address = addressServices.findByCity(city);
        return new ResponseEntity<>(address, HttpStatus.CREATED);
    }

//    @GetMapping("/{pinCode}/findByPinCode")
//    public ResponseEntity<Address> findByPinCode (@PathVariable int pinCode){
//        Address address= addressServices.findByPinCode(pinCode);
//        return new ResponseEntity<>(address,HttpStatus.CREATED);
//    }


}