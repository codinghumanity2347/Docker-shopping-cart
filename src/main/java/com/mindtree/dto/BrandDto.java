package com.mindtree.dto;

import java.util.List;

import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mindtree.entity.Category;
import com.mindtree.entity.Jacket;
import com.mindtree.entity.Shirt;

public class BrandDto {
	private int brandId;
	private String brandName;
	@JsonIgnoreProperties("brands")
	List<CategoryDto> categories;

	List<JacketDto> jackets;

	List<ShirtDto> shirts;

	public BrandDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BrandDto(int brandId, String brandName, List<CategoryDto> categories, List<JacketDto> jackets,
			List<ShirtDto> shirts) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
		this.categories = categories;
		this.jackets = jackets;
		this.shirts = shirts;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public List<CategoryDto> getCategories() {
		return categories;
	}

	public void setCategories(List<CategoryDto> categories) {
		this.categories = categories;
	}

	public List<JacketDto> getJackets() {
		return jackets;
	}

	public void setJackets(List<JacketDto> jackets) {
		this.jackets = jackets;
	}

	public List<ShirtDto> getShirts() {
		return shirts;
	}

	public void setShirts(List<ShirtDto> shirts) {
		this.shirts = shirts;
	}

}
