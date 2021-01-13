package com.mindtree.service;

import java.util.List;

import com.mindtree.dto.BrandDto;
import com.mindtree.dto.CategoryDto;
import com.mindtree.entity.Brand;

public interface BrandService {

	public CategoryDto addBrand(BrandDto brandDto, int categoryId);

	public List<BrandDto> getbrand();

}
