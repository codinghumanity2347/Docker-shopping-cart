package com.mindtree.service;

import java.util.List;

import com.mindtree.dto.BrandDto;
import com.mindtree.dto.CategoryDto;
import com.mindtree.entity.Category;

public interface CategoryService {

	public CategoryDto addCategory(CategoryDto categoryDto);

	public CategoryDto getcategory(int categoryId);

	public List<CategoryDto> getallcategory();

	public List<Category> getCategories();

	public List<BrandDto> getbrands(int categoryId);

}
