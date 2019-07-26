package com.example.demo.repository;

import com.example.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Repository to store Customer data
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
