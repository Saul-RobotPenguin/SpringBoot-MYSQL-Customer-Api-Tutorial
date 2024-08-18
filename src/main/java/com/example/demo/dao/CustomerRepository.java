package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    /*
     * MEANINGFUL TO REMEMBER METHODS IN JpaRepository => count, deleteById,
     * deleteAll, existsById,
     * findALL, findById, save, save all and etc
     * All of these methods are being made in the JpaRepository therefore you do not
     * need to put anything in here unless the ones stated do not suit your needs
     * 
     */

    // Check the documentation on JpaRepository on what methods are implemented to
    // suit your needs, if theres not one that suits your needs THEN YOU WILL have
    // to create a method and add it here!!

}
