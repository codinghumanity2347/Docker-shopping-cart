package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

	public Category findByCategoryName(String categoryName);



}
