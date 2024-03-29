package com.example.videostore.repository;

import com.example.videostore.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
    // Method to find a customer by ID
    Optional<Customer> findById(String id);
}
