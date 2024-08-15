package com.foodapp.springfoodapp.controller;

import com.foodapp.springfoodapp.entiry.Address;
import com.foodapp.springfoodapp.service.AddressServices;
import com.foodapp.springfoodapp.usersecurity.modual.User;
import com.foodapp.springfoodapp.usersecurity.response.ApiResponse;
import com.foodapp.springfoodapp.usersecurity.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/address")
public class AddressController {

    private final AddressServices addressServices;
//    private final UserService userService;
//    @RequestHeader("Authorization") String jwt


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
    public ResponseEntity<Address> findByAddressId(@PathVariable Integer id) {
        Address address = addressServices.findByAddressId(id);
        return ResponseEntity.ok(address);
    }

    @DeleteMapping("/delete/{addressId}")
    public ResponseEntity<ApiResponse> deleteBill(@PathVariable int addressId) {
        addressServices.deleteAddress(addressId);
        ApiResponse response = new ApiResponse("Deleted Success", true);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Address> updateAddress(@PathVariable int id, @RequestBody Address updateAddress) {
        Address address = addressServices.updateAddress(updateAddress, id);
        return new ResponseEntity<>(address, HttpStatus.OK);
    }

    @GetMapping("/findCity/{city}")
    public ResponseEntity<Address> findByAddressCity(@PathVariable String city) {
        Address address = addressServices.findByCity(city);
        return new ResponseEntity<>(address, HttpStatus.CREATED);
    }
//
//    @PostMapping("/findByPinCode/{pinCode}")
//    public Address findByPinCode (@PathVariable String pinCode){
//        return addressServices.findByPinCode(pinCode);
//    }


}