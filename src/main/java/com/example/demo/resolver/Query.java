package com.example.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.entity.User;
import com.example.demo.repository.FollowerRepository;
import com.example.demo.repository.PostRepository;
import com.example.demo.repository.UserRepository;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PostRepository postRepository;

    @Autowired
    FollowerRepository followerRepository;


    public List<User> findUsers() {
        return userRepository.findAll();
    }

    public User findUser(Long id) {
        User user = userRepository.findById(id).get();
        user.setPosts(postRepository.findByUserId(id));
        user.setFollowers(followerRepository.findByUserId(id));

        return user;
    }


}


