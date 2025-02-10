package com.blog.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.util.ArrayList;
import java.util.List;
@Getter
@Setter

@Entity
@Table(name="categories")
public class Category {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer categoryId;
    @Column(name="tile",length=100,nullable = false)
    private String categoryTitle;
    @Column(name="description")
    private String categoryDescription;
    @OneToMany(mappedBy="category",cascade = CascadeType.ALL)
    private List<Post> posts= new ArrayList<Post>();
}
