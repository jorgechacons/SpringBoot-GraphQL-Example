package com.example.demo.inputs;

import lombok.Data;


@Data
public class CommentInput {

    private Long id;

    private Long postId;

    private String content;
}
