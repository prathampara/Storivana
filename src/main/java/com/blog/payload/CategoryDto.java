package com.blog.payload;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class CategoryDto {

    private Integer categoryId;
    @NotBlank
    @Size(min=4)
    private String categoryTitle;
    @NotBlank
    @Size(min=10)
    private String categoryDescription;


}
