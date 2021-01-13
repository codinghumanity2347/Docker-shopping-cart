package com.mindtree.service;

import java.util.List;

import com.mindtree.dto.BrandDto;
import com.mindtree.dto.JacketDto;
import com.mindtree.entity.Jacket;

public interface JacketService {

public	BrandDto addjacket(JacketDto jacketDto, int brandId);

public List getalljackets();

}
