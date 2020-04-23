package com.example.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

   /* @Autowired
    UserRepository userRepository;

    *//**
     * @param id
     * @param name
     * @param lastName
     * @return User saved into db
     *//*
    public User findUser(Long id, String name, String lastName){
        return customerRepository.save(new User(id,name,lastName));
    }


    *//**
     * @param id
     * @return User Deleted message
     *//*
    public String deleteCustomer(Long id){
        customerRepository.deleteById(id);
        return "User deleted";
    }*/
}
