package com.example.demo.services.impl;

import com.example.demo.models.Customer;
import com.example.demo.services.CustomerService;
import com.example.demo.dao.CustomerRepository;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

// CustomerServiceImpl must meet the requirements of checklist CustomerService
// otherwise errors
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    // APPLE
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    // BANANA
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    // MANGO
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    // GRAPES
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

}
