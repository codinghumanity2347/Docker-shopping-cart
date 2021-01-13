package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.entity.Shirt;

public interface ShirtRepository extends JpaRepository<Shirt, Integer>{

}
