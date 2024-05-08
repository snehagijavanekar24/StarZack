package com.project.StarZack.Service;

import java.util.List;
import com.project.StarZack.entity.Category;

public interface CategoryService {

	public String CreateCategoryDetails(Category category);
	public String updateCategoryDetails(Category category);
	public String deleteCategoryDetails(String GameId);
	public Category getCategoryDetails(String GameId);
	public List<Category> getAllCategory();

}
