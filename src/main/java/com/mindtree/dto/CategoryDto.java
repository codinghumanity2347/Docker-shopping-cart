package com.mindtree.dto;

import java.util.List;

import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mindtree.entity.Brand;

public class CategoryDto {
	private int categoryId;
	private String categoryName;
	@JsonIgnoreProperties("categories")
	List<BrandDto> brands;

	public CategoryDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<BrandDto> getBrands() {
		return brands;
	}

	public void setBrands(List<BrandDto> brands) {
		this.brands = brands;
	}

	public CategoryDto(int categoryId, String categoryName, List<BrandDto> brands) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.brands = brands;
	}


}
