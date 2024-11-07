package com.foodapp.springfoodapp.serviceImpl;


import com.foodapp.springfoodapp.entiry.Address;
import com.foodapp.springfoodapp.repository.AddressRepo;
import com.foodapp.springfoodapp.service.AddressServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddressServicesImpl implements AddressServices {

    private final AddressRepo addressRepo;

    //todo -> error "Query did not return a unique result: 3 results were returned",
    @Override
    public List<Address> saveAddress(List<Address> addresses) {
        return addressRepo.saveAll(addresses);
    }

    @Override
    public Address save(Address address) {
        Address saveAddress = addressRepo.save(address);
        return saveAddress;
    }

    @Override
    public List<Address> getAll() {
        return addressRepo.findAllAddress();
    }

    @Override
    public Address findByAddressId(int id) {
//
//        addresses.stream()
//                .filter(find -> find.addressId == id)
//                .findFirst();
//
        Optional<Address> address = addressRepo.findById(id);
        if (address.isEmpty()) {
            throw new IllegalArgumentException("Address Not Found");
        } else {
            return address.get();
        }
    }

//    @Override
//    public void deleteAddress(int addressId) {
//        addressRepo.deleteById(addressId);
//    }

    @Override
    public String deleteAddress(int addressId) {
        Optional<Address> addressOpt = addressRepo.findById(addressId);
        if (addressOpt.isPresent()) {
            addressRepo.deleteById(addressId);
        }
        return "BIll Deleted";
    }

//    @Override
//    public Address findByPinCode(int pinCode) {
//        Address address = addressRepo.findByPinCode(pinCode);
//        return address;
//    }

    @Override
    public Address findByCity(String city) {
        Optional<Address> address = Optional.ofNullable(addressRepo.findByCity(city));
        if (address.isEmpty()) {
            throw new RuntimeException("Not Found");
        }
        return address.get();
    }

    @Override
    public List<Address> findAdd() {
        return addressRepo.findAllAddress();
    }


    @Override
    public Address updateAddress(Address updateAddress, int id) {
        Address address = addressRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("No Address Id"));

        if (address.getArea() != null) {
            address.setArea(updateAddress.getArea());
        }
        if (address.getCity() != null) {
            address.setCity(updateAddress.getCity());
        }
        if (address.getState() != null) {
            address.setState(updateAddress.getState());
        }
        if (address.getCountry() != null) {
            address.setCountry(updateAddress.getCountry());
        }
        if (address.getPinCode() != null) {
            address.setCountry(updateAddress.getCountry());
        }

        addressRepo.save(address);
        return address;
    }


}

