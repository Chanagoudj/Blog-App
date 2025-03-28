package com.codewithcj.blog.services;

import java.util.List;

import com.codewithcj.blog.payloads.CategoryDto;

public interface CategoryService {
	
	//Create
	CategoryDto createCategory(CategoryDto categoryDto);
	
	//Update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	//Delete
	void deleteCategory(Integer categoryId);
	
	//get
	CategoryDto getCategory(Integer categoryId);
	
	//getAll
	List<CategoryDto> getCategories();

}
