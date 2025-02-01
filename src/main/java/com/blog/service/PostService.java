package com.blog.service;

import com.blog.entity.Post;
import com.blog.payload.PostDto;
import com.blog.payload.PostResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
 PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
 PostDto updatePost(PostDto postDto, Integer postId);
 void deletePost(Integer postId);
 PostResponse getAllPosts(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
PostDto getPostById(Integer postId);
List<PostDto> getPostsByCategory(Integer categoryId);
List<PostDto> getPostsByUser(Integer userId);
List<PostDto> searchPosts(String Keyword);
}
