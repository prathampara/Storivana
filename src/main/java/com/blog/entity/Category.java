package com.blog.entity;

import jakarta.persistence.*;



import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="categories")
public class Category {
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer categoryId;
    @Column(name="tile",length=100,nullable = false)
    private String categoryTitle;
    @Column(name="description")
    private String categoryDescription;

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }


    @OneToMany(mappedBy="category",cascade = CascadeType.ALL)
    private List<Post> posts= new ArrayList<Post>();
}
