package com.blog.payload;

import com.blog.entity.Post;
import lombok.*;

import java.util.List;
@Getter
@Setter

public class PostResponse {
    private List<PostDto> content;
    private long totalElements;
    private int totalPages;
    private int pageSize;
    private int pageNumber;
    private boolean lastPage;
}
