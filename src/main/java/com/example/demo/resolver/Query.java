package com.example.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Must have a component to automatic instance
@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    CustomerRepository customerRepository;

    //Method to get all the customers from the customerRepository
    //must has to match with the graphQL Schema
    public Iterable<Customer> getCustomers(){
        return customerRepository.findAll();
    }
}
