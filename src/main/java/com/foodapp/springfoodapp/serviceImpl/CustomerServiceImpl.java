package com.foodapp.springfoodapp.serviceImpl;


import com.foodapp.springfoodapp.entiry.Customer;
import com.foodapp.springfoodapp.repository.CustomerRepo;
import com.foodapp.springfoodapp.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepo customerRepo;


    @Override
    public Customer add(Customer exitstcustomer) {
        return customerRepo.save(exitstcustomer);
    }

    @Override
    public List<Customer> saveCustomer(List<Customer> customers) {
        return customerRepo.saveAll(customers);
    }

    @Override
    public List<Customer> getCustomer() {
        return customerRepo.findAll();
    }

    @Override
    public void deleteCustomerByid(Integer customerId) {
//		customerRepo.deleteById(customerId);
        if (customerId == 0 || customerId == null) {
            customerRepo.deleteById(customerId);
        } else {
            log.info("you need to create Customer Id");
        }
    }

//    @Override
//    public List<Customer> getAllCustomerByNative() {
//        return customerRepo.getAllCustomerByNative();
//    }

    @Override
    public Customer updateCustomer(Integer customerId, Customer updateCustomer) {
        Customer customer1 = customerRepo.findById(customerId)
                .orElseThrow(() -> new IllegalArgumentException("Not found Your ID"));

        Customer exitstcustomer = new Customer();

        exitstcustomer.setFullName(updateCustomer.getFullName());
        exitstcustomer.setGender(updateCustomer.getGender());
        exitstcustomer.setAge(updateCustomer.getAge());
        exitstcustomer.setMobileNumber(updateCustomer.getMobileNumber());
        exitstcustomer.setEmail(updateCustomer.getEmail());
        customerRepo.save(exitstcustomer);
        return exitstcustomer;
    }

    @Override
    public Customer findByEmail(String email) {
        return customerRepo.findByEmail(email);
    }

    @Override
    public Customer findByMobileNumber(String mobileNumber) {
        return customerRepo.findByMobileNumber(mobileNumber);
    }
}
