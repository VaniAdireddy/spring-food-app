package com.foodapp.springfoodapp.serviceImpl;


import com.foodapp.springfoodapp.entiry.Address;
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
        return addressRepo.findAll();
    }

    @Override
    public Address findByAddressId(Integer id) {
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
    public void deleteAddress(int addressId) {
        Optional<Address> addressOpt = addressRepo.findById(addressId);
        if (addressOpt.isPresent()) {
            addressRepo.deleteById(addressId);
        }
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
//        address.setState(updateAddress.getState());
//        address.setCity(updateAddress.getCity());
//        address.setArea(updateAddress.getArea());
//        address.setCountry(updateAddress.getCountry());
//        address.setPinCode(updateAddress.getPinCode());
        addressRepo.save(address);
        return address;
    }

    @Override
    public Address findByCity(String city) {
        return addressRepo.findByCity(city);
    }


}

