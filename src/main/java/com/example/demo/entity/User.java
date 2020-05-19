package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

//Entity to map data base table
@Data
@Entity
@Table(name = "USER")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ADDRESS")
    private String address;

    @OneToMany(mappedBy="user",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Follower> followers;

    @OneToMany(mappedBy="user",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Post> posts;
}
