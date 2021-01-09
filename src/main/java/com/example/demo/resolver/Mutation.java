package com.example.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.entity.Comment;
import com.example.demo.inputs.CommentInput;
import com.example.demo.inputs.UserInput;
import com.example.demo.entity.User;
import com.example.demo.repository.CommentRepository;
import com.example.demo.repository.PostRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PostRepository postRepository;

    @Autowired
    CommentRepository commentRepository;

    public String deleteUser(Long id) {
        userRepository.deleteById(id);
        return "User deleted";
    }

    public User addUser(UserInput userInput) {
        User user = User.builder()
                .id(userInput.getId())
                .name(userInput.getName())
                .address(userInput.getAddress())
                .build();

        return userRepository.save(user);
    }

    public Comment addComment(CommentInput commentInput) {
        Comment comment = Comment.builder()
                        .id(commentInput.getId())
                        .post(postRepository.findById(commentInput.getPostId()).get())
                        .content(commentInput.getContent())
                        .build();

        return commentRepository.save(comment);
    }
}

