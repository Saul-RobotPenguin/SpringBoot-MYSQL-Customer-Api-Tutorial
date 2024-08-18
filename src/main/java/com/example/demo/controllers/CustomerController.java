package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.Customer;

import com.example.demo.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    // Path Variable v
    // https://localhost:8080/customer/{id}
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    // @RequestBody
    // Customer Classes
    /// Updated info customer firstName : Max, lastName :Specter, password: 123

    // @PathVariable v
    // https://localhost:8080/customer/{id}

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer newCustomerDetails) {

        // Customer Classes
        /// Original customer firstName : Sam, lastName :Specter, password: 123
        Customer customer = customerService.getCustomerById(id);

        if (customer != null) {

            // firstName: Max -> newCustomerDetails -> firstName :Sam
            customer.setFirstName(newCustomerDetails.getFirstName());
            customer.setLastName(newCustomerDetails.getLastName());
            customer.setPassword(newCustomerDetails.getPassword());
            customer.setWishList(newCustomerDetails.getWishList());

            return customerService.saveCustomer(customer);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
        return "Customer has been deleted successfully";
    }

}
