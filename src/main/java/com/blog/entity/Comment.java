package com.blog.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
@Table(name="comments")
public class Comment {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String content;
    @ManyToOne
    private Post post;
}

