package com.mindtree.service.serviceimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.mindtree.dto.BrandDto;
import com.mindtree.dto.JacketDto;
import com.mindtree.entity.Brand;
import com.mindtree.entity.Category;
import com.mindtree.entity.Jacket;
import com.mindtree.repository.BrandRepository;
import com.mindtree.repository.JacketRepository;
import com.mindtree.service.JacketService;

@Service
public class JacketServiceImpl implements JacketService {

	@Autowired

	JacketRepository jacketrepo;

	@Autowired

	BrandRepository brandrepo;

	ModelMapper modelMapper = new ModelMapper();

	public JacketDto convertEntitytoDto(Jacket jacket) {
		return modelMapper.map(jacket, JacketDto.class);

	}

	public BrandDto convertbrandEntitytoDto(Brand brand) {
		return modelMapper.map(brand, BrandDto.class);

	}
	public Jacket convertDtotoEntity(JacketDto jacketDto) {
		return modelMapper.map(jacketDto, Jacket.class);

	}

	@Override
	public BrandDto addjacket(JacketDto jacketDto,int brandId) {

		// TODO Auto-generated method stub
		Brand brand=brandrepo.getOne(brandId);
		Jacket jacket = convertDtotoEntity(jacketDto);
		List<Jacket> jackets=new ArrayList<Jacket>();
		jackets.add(jacket);
		brand.setJackets(jackets);
		brand=brandrepo.save(brand);
		System.err.println(brand);
		BrandDto b=convertbrandEntitytoDto(brand);
		return b;

	}

	@Override
	public List getalljackets() {
		// TODO Auto-generated method stub
		List jackets = new ArrayList();
		Iterable jacketsIterable = jacketrepo.findAll();
		Iterator jacketsIterator = jacketsIterable.iterator();
		while (jacketsIterator.hasNext()) {
			jackets.add(jacketsIterator.next());
		}
		Collections.sort(jackets);
		return jackets;
	}

}
