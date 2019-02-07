package com.quycntt.service;

import com.quycntt.entity.Category;

public interface CategoryService {
	Iterable<Category> findAll();
	Category findCategory(int id);
}
