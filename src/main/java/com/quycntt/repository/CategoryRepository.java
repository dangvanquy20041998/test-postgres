package com.quycntt.repository;

import org.springframework.data.repository.CrudRepository;

import com.quycntt.entity.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer>{
	Category findById(int id);
}
