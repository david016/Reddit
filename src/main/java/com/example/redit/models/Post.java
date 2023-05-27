package com.example.redit.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Timestamp;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String url;
    private Timestamp timestamp;
    private int score;

    public Post(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public Post() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
