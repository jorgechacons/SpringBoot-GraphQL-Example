package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//Entity to map data base table
@Data
@Entity
@Table(name = "COMMENT")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comment {

    @Id
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name="POST_ID")
    private Post post;

    @Column(name = "CONTENT")
    private String content;
}
