package com.blog.payload;

import com.blog.entity.Post;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentDto {
    private int id;
    private String content;

}
