package com.codewithcj.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithcj.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {
	
	

}
