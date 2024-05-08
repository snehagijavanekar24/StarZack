package com.project.StarZack.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;


import com.project.StarZack.entity.Category;

import com.project.StarZack.repository.Categoryrepository;
import com.project.StarZack.Service.CategoryService;

@Service
public class CategoryServiceimpl implements CategoryService  {
		Categoryrepository  categoryrepo;
	

	public CategoryServiceimpl(Categoryrepository categoryrepo) {
			
			this.categoryrepo = categoryrepo;
		}

	@Override
	public String CreateCategoryDetails(Category  category) {
		 categoryrepo.save(category);
		return "Success";
	}

	@Override
	public String updateCategoryDetails(Category  category) {
		 categoryrepo.save(category);
		return "Success";
	}

	@Override
	public String deleteCategoryDetails(String GameId) {
		 categoryrepo.deleteById(GameId);
		return "Success";
	}
	@Override
	public List<Category> getAllCategory() {
			return categoryrepo.findAll();
			
	}

	@Override
	public Category getCategoryDetails(String GameId) {
		return categoryrepo.findById(GameId).get();
	
	}

	

}
