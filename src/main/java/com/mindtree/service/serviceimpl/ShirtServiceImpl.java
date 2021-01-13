package com.mindtree.service.serviceimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.dto.BrandDto;
import com.mindtree.dto.CategoryDto;
import com.mindtree.dto.ShirtDto;
import com.mindtree.entity.Brand;
import com.mindtree.entity.Category;
import com.mindtree.entity.Shirt;
import com.mindtree.repository.BrandRepository;
import com.mindtree.repository.CategoryRepository;
import com.mindtree.repository.ShirtRepository;
import com.mindtree.service.ShirtService;

@Service
public class ShirtServiceImpl implements ShirtService {

	@Autowired
	ShirtRepository shirtrepo;
	
	@Autowired
	BrandRepository brandrepo;

	ModelMapper modelMapper = new ModelMapper();

	public ShirtDto convertEntitytoDto(Shirt shirt) {
		return modelMapper.map(shirt, ShirtDto.class);

	}
	
	public BrandDto convertbrandEntitytoDto(Brand brand) {
		return modelMapper.map(brand, BrandDto.class);

	}

	public Shirt convertDtotoEntity(ShirtDto shirtDto) {
		return modelMapper.map(shirtDto, Shirt.class);

	}

	@Override
	public BrandDto addshirt(int brandId ,ShirtDto shirtDto) {
		// TODO Auto-generated method stub
		Shirt shirt = convertDtotoEntity(shirtDto);
		Brand brand=brandrepo.getOne(brandId);
		List<Shirt> shirts=new ArrayList<Shirt>();
		shirts.add(shirt);
		brand.setShirts(shirts);
		brand=brandrepo.save(brand);
		System.err.println(brand);
		BrandDto branddto=convertbrandEntitytoDto(brand);
		return branddto;
	}

	@Override
	public List getallshirts() {
		// TODO Auto-generated method stub
		List shirts = new ArrayList();
		Iterable shirtsIterable = shirtrepo.findAll();
		Iterator shirtsIterator = shirtsIterable.iterator();
		while (shirtsIterator.hasNext()) {
			shirts.add(shirtsIterator.next());
		}
		Collections.sort(shirts);
		return shirts;
		 
	}

}
