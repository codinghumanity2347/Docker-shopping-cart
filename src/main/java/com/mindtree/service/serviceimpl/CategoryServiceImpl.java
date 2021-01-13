package com.mindtree.service.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.dto.BrandDto;
import com.mindtree.dto.CategoryDto;
import com.mindtree.entity.Brand;
import com.mindtree.entity.Category;
import com.mindtree.repository.CategoryRepository;
import com.mindtree.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	CategoryRepository categoryrepo;
	
	ModelMapper modelMapper=new ModelMapper();
	
	public CategoryDto convertEntitytoDto(Category category)
	{
		return modelMapper.map(category,CategoryDto.class);
		
	}
	
	public BrandDto convertbrandEntitytoDto(Brand brand)
	{
		return modelMapper.map(brand,BrandDto.class);
		
	}
	public Category convertDtotoEntity(CategoryDto categorydto)
	{
		return modelMapper.map(categorydto,Category.class);
		
	}
	@Override
	public CategoryDto addCategory(CategoryDto categoryDto) {
		// TODO Auto-generated method stub
		Category category=convertDtotoEntity(categoryDto);
		category=categoryrepo.save(category);
		categoryDto=convertEntitytoDto(category);
		return categoryDto;
	}
//	@Override
//	public CategoryDto getcategory(int categoryId) {
//		// TODO Auto-generated method stub
//		Category category=categoryrepo.getOne(categoryId);
//		CategoryDto categoryDto=convertEntitytoDto(category);
//		return categoryDto;
//	}
	@Override
	public List<CategoryDto> getallcategory() {
		// TODO Auto-generated method stub
		List<Category> categories=categoryrepo.findAll();
		List<CategoryDto> categoriesdto=categories.stream().map(e->convertEntitytoDto(e)).collect(Collectors.toList());
		return categoriesdto ;
	}
	@Override
	public List<Category> getCategories() {
		return categoryrepo.findAll();
	}
	@Override
	public CategoryDto getcategory(int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<BrandDto> getbrands(int categoryId) {
		// TODO Auto-	generated method stub
//		System.out.println(categoryId);
		Category category=categoryrepo.findById(categoryId).get();
//		System.err.println(category);
		List<Brand> brands=category.getBrands();
//		System.err.println(brands);
		List<BrandDto> brandsdto=brands.stream().map(e->convertbrandEntitytoDto(e)).collect(Collectors.toList());
		return brandsdto;
	}
}
