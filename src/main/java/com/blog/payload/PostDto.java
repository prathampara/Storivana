package com.blog.payload;

import com.blog.entity.Category;
import com.blog.entity.Comment;
import com.blog.entity.User;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
@Setter
@Getter
public class PostDto {

    private Integer postId;
    private String title;
    private String content;
    private String imageName;
    private Date addedDate;
    private CategoryDto category;
    private UserDto user;
    private Set<CommentDto> comments = new HashSet<>();
}
