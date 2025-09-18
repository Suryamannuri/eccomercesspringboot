package com.jsp.eccomercesspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.eccomercesspringboot.entity.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer>  {

}
