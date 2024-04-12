package com.project.StarZack.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.project.StarZack.Entity.Category;

import com.project.StarZack.Service.CategoryService;

@RestController
@RequestMapping("/Category")
public class CategoryController {
	 CategoryService categoryService;
	 
		

		public CategoryController(CategoryService categoryService) {
		
		this.categoryService = categoryService;
	}

		@GetMapping("{GameId}")
	    public Category getCategoryDetails(@PathVariable("GameId") String GameId){
	        return categoryService.getCategoryDetails(GameId);
	    }

	    @GetMapping()
	    public List <Category> getAllCategoryDetails(){
	        return categoryService.getAllCategory();
	    }

	    @PostMapping
	    public String createCategoryDetails(@RequestBody Category category){
	        categoryService.CreateCategoryDetails(category);
	        return "Category Created Successfully";
	    }

	    @PutMapping
	    public String updateCategoryDetails(@RequestBody Category category ){
	    	categoryService.updateCategoryDetails(category); 
	        return "Category Updated Successully";
	    }

	    @DeleteMapping("{GameId}")
	    public String deleteCategoryDetails(@PathVariable("GameId") String GameId){
	    	categoryService.deleteCategoryDetails(GameId);
	        return "Category  Deleted Successfully";
	    }


}
