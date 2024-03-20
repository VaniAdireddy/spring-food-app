package com.foodapp.springfoodapp.controller;

import com.foodapp.springfoodapp.entiry.Category;
import com.foodapp.springfoodapp.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/category")
public class CategoryController {
	
	private final CategoryService categoryService;
	
	@PostMapping("/addCategory")
	public Category addCategory(@RequestBody Category category) {
		return categoryService.addCategory(category);
	}
	
	@PostMapping("/addMore")
	public List<Category> addListCategory(@RequestBody List<Category> categories) {
		return categoryService.saveCategory(categories);
	}
	
	@GetMapping("/get")
	public List<Category> findAllCategory() {
		
		return categoryService.getAllcategorys();
	}

	@DeleteMapping("/delete/{categoryId}")
	public String deleteCategory(@PathVariable Integer categoryId){
		return categoryService.deleteCategoryById(categoryId);
	}
	@PutMapping("/update/{id}")
	public Category updateAddress(@RequestBody Category updateCategory,Integer id){
		return categoryService.updatecategory(updateCategory,id);
	}


}
