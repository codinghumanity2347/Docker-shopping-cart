package com.mindtree.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.dto.BrandDto;
import com.mindtree.dto.CategoryDto;
import com.mindtree.entity.Brand;
import com.mindtree.entity.Category;
import com.mindtree.repository.BrandRepository;
import com.mindtree.repository.CategoryRepository;
import com.mindtree.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService {

	ModelMapper modelMapper = new ModelMapper();

	@Autowired
	BrandRepository brandrepo;
	
	@Autowired 
	CategoryRepository categoryrepo;

	public BrandDto convertEntitytoDto(Brand brand) {
		return modelMapper.map(brand, BrandDto.class);

	}
	
	public CategoryDto convertcategoryEntitytoDto(Category category) {
		return modelMapper.map(category, CategoryDto.class);

	}

	public Brand convertDtotoEntity(BrandDto brandDto) {
		return modelMapper.map(brandDto, Brand.class);

	}

	@Override
	public CategoryDto addBrand(BrandDto brandDto,int categoryId) {
		// TODO Auto-generated method stub
		System.out.println(categoryId);
		Brand brand = convertDtotoEntity(brandDto);
		Category category=categoryrepo.getOne(categoryId);
		List<Brand> brands=new ArrayList<Brand>();
		brands.add(brand);
		category.setBrands(brands);
		System.out.println(category);
		category=categoryrepo.save(category);
		CategoryDto categoreydto = convertcategoryEntitytoDto(category);

		return categoreydto;
	}

	@Override
	public List<BrandDto> getbrand() {
		// TODO Auto-generated method stub
		List<Brand> brands=brandrepo.findAll();
		System.err.println(brands);
		List<BrandDto> brandsdto=brands.stream().map(e->convertEntitytoDto(e)).collect(Collectors.toList());
		return brandsdto;
	}

}
