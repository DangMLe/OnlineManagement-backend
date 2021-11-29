package com.greenwich.AssetManagement.services;

import java.util.List;

import com.greenwich.AssetManagement.Model.DTO.CategoryDTO;
import com.greenwich.AssetManagement.Model.Entity.Category;

public interface CategoryService {
	List<Category> findAllCategory();
	Category findByPrefix(String prefix);
	boolean existByPrefix(String prefix);
	boolean existByName(String name);
	Category createCategory(Category category);
	CategoryDTO convertToDto(Category category);
	Category convertToEntity(CategoryDTO categoryDto);
}
