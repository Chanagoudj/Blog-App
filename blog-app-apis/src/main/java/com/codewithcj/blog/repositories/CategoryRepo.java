package com.codewithcj.blog.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithcj.blog.entities.Category;
import com.codewithcj.blog.payloads.CategoryDto;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
	

}
