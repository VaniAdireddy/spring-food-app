package com.foodapp.springfoodapp.serviceImpl;

import com.foodapp.springfoodapp.entiry.Customer;
import com.foodapp.springfoodapp.repository.CustomerRepo;
import com.foodapp.springfoodapp.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepo customerRepo;

    @Override
    public Customer add(Customer customer) {
        return customerRepo.save(customer);
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
    public String deleteCustomerByid(Integer customerId) {
        customerRepo.deleteById(customerId);
        return "delete success";
    }

    @Override
    public Customer updateCustomer(Integer customerId, Customer updateCustomer) {
        Customer customer = customerRepo.findById(updateCustomer.getCustomerId())
                .orElseThrow(() -> new IllegalArgumentException("no customers"));

        customer.setCustomerId(updateCustomer.getCustomerId());
        customer.setFullName(updateCustomer.getFullName());
        customer.setAge(updateCustomer.getAge());
        customer.setEmail(updateCustomer.getEmail());
        customer.setAddress(updateCustomer.getAddress());
        customer.setGender(updateCustomer.getGender());
        customerRepo.save(customer);
        return customer;
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