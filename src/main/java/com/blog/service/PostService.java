package com.blog.service;

import com.blog.entity.Post;
import com.blog.payload.PostDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
 PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
 Post updatePost(PostDto postDto, Integer postId);
 void deletePost(Integer postId);
 List<Post> getAllPosts();
Post getPostById(Integer postId);
List<Post> getPostsByCategory(Integer categoryId);
List<Post> getPostsByUser(Integer userId);
List<Post> searchPosts(String Keyword);

}
