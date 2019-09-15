package com.example.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



//Must have a component to automatic instance
@Component
public class Query implements GraphQLQueryResolver {

    Logger logger = LoggerFactory.getLogger(Query.class);

    @Autowired
    CustomerRepository customerRepository;

    //Method to get all the customers from the customerRepository
    //must have to match with the graphQL Schema
    public Iterable<Customer> findAllCustomers(){
        logger.info("Responding all customers");
        return customerRepository.findAll();
    }

    public Optional<Customer> findCustomer( Long id) {
        logger.info("Responding customer by id search");
        return customerRepository.findById(id);
    }

    public Iterable<Customer> findCustomerByIds(String id){
        return customerRepository.findCustomerByIdIn(Arrays.asList(id.split(",")).stream()
                .map(Long::parseLong).collect(Collectors.toList()));
    }

}
