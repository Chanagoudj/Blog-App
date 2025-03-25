package com.codewithcj.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithcj.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
