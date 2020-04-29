package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

//Entity to map data base table
@Data
@Entity
@Table(name = "POST")
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name="USER_ID")
    private User user;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "TITLE")
    private String title;

    @OneToMany(mappedBy="post", fetch= FetchType.EAGER,cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> comments;
}
