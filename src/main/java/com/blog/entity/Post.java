package com.blog.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="post")
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
private Integer postId;
    @Column(name="post_title" ,nullable = false, length= 100)
private String title;
    @Column(length=10000)
private String content;
private String imageName;
private Date addedDate;


    @ManyToOne
@JoinColumn(name="category_id")
private Category category;

@ManyToOne
private User user;
@OneToMany(mappedBy = "post",cascade = CascadeType.ALL)
private Set<Comment> comments = new HashSet<>();
}
