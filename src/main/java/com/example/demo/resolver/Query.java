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


@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    CustomerRepository customerRepository;


    /**
     * @return All customers
     */
    public Iterable<Customer> findAllCustomers(){
        return customerRepository.findAll();
    }


    /**
     * @param id
     * @return Customer ( search by id )
     */
    public Optional<Customer> findCustomer( Long id) {
        return customerRepository.findById(id);
    }


    /**
     * @param id
     * @return all customers that match with the ids
     */
    public Iterable<Customer> findCustomerByIds(String id){
        return customerRepository.findCustomerByIdIn(Arrays.asList(id.split(",")).stream()
                .map(Long::parseLong).collect(Collectors.toList()));
    }

}
