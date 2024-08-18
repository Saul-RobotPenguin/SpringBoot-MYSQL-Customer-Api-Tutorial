package com.example.demo.services;

import java.util.List;

import com.example.demo.models.Customer;

//Fruit Basket or Checklist
public interface CustomerService {

    // apple
    List<Customer> getAllCustomers();

    // banana
    Customer getCustomerById(Long id);

    // mango
    Customer saveCustomer(Customer customer);

    // grapes
    void deleteCustomer(Long id);

}
