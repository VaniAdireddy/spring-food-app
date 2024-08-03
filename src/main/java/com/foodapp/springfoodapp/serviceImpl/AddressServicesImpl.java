package com.foodapp.springfoodapp.serviceImpl;


import com.foodapp.springfoodapp.entiry.Address;
import com.foodapp.springfoodapp.entiry.Customer;
import com.foodapp.springfoodapp.repository.AddressRepo;
import com.foodapp.springfoodapp.service.AddressServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddressServicesImpl implements AddressServices {

    private final AddressRepo addressRepo;


    @Override
    public List<Address> saveAddress(List<Address> addresses) {

        return addressRepo.saveAll(addresses);
    }

    @Override
    public List<Address> getAddress() {
        return addressRepo.findAll();
    }

    @Override
    public Optional<Address> getById(int addressId) {
        return addressRepo.findById(addressId);
    }

    @Override
    public String deleteAddress(int addressId) {
         addressRepo.deleteById(addressId);
         return "delete successful";
    }

    @Override
    public Address updateAddress(Address updateAddress) {
        Address address=addressRepo.findById(updateAddress.getAddressId())
                .orElseThrow(()->new IllegalArgumentException("No Address Id"));

        address.setState(updateAddress.getState());
        address.setArea(updateAddress.getArea());
        address.setCountry(updateAddress.getCountry());
        address.setPinCode(updateAddress.getPinCode());
        address.setCity(updateAddress.getCity());
        addressRepo.save(address);
        return address;
    }

    @Override
    public Address findByCity(String city) {
        return addressRepo.findByCity(city);
    }

    @Override
    public Address saveSingleAdress(Address address) {
        return addressRepo.save(address);
    }


}

