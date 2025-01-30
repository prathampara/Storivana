package com.blog.service;

import com.blog.payload.CategoryDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    CategoryDto createCategory(CategoryDto categoryDto);
    CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
    CategoryDto getCategory(Integer categoryId);
    void deleteCategory(Integer categoryId);
    List<CategoryDto> getCategories();
}
