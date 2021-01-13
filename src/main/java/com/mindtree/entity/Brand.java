package com.mindtree.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Brand {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int brandId;
	private String brandName;
	@JsonIgnoreProperties("brands")
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "brands")
	List<Category> categories;
	@OneToMany(cascade = CascadeType.ALL)
	List<Jacket> jackets;
	@OneToMany(cascade = CascadeType.ALL)
	List<Shirt> shirts;

	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Brand(int brandId, String brandName, List<Category> categories, List<Jacket> jackets, List<Shirt> shirts) {
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

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public List<Jacket> getJackets() {
		return jackets;
	}

	public void setJackets(List<Jacket> jackets) {
		this.jackets = jackets;
	}

	public List<Shirt> getShirts() {
		return shirts;
	}

	public void setShirts(List<Shirt> shirts) {
		this.shirts = shirts;
	}

	@Override
	public String toString() {
		return "Brand [brandId=" + brandId + ", brandName=" + brandName + ", categories=" + categories + ", jackets="
				+ jackets + ", shirts=" + shirts + "]";
	}

}
