package com.example.demo.repository;

import com.example.demo.entity.Follower;
import com.example.demo.entity.Post;
import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//Repository to store User data
@Repository
public interface FollowerRepository extends JpaRepository<Follower,Long> {
    List<Follower> findByUserId(Long user_id);
}
