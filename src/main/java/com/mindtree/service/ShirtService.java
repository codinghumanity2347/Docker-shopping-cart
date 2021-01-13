package com.mindtree.service;

import java.util.List;

import com.mindtree.dto.BrandDto;
import com.mindtree.dto.ShirtDto;
import com.mindtree.entity.Shirt;

public interface ShirtService {


	public List getallshirts();

	public BrandDto addshirt(int brandId, ShirtDto shirtDto);

}
