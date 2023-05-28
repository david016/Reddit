package com.example.redit.controllers;

import com.example.redit.Repositories.PostRepository;
import com.example.redit.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping
    public ResponseEntity<?> getPosts(){
        return ResponseEntity.ok().body(postRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<?> addPost(@RequestBody Post post){
        long currentTimestamp = Instant.now().getEpochSecond();
        post.setTimestamp(currentTimestamp);
        return ResponseEntity.ok().body(postRepository.save(post));
    }
}
