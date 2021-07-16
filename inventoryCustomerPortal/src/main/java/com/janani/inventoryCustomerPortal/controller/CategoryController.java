package com.janani.inventoryCustomerPortal.controller;

import com.janani.inventoryCustomerPortal.model.Category;
import com.janani.inventoryCustomerPortal.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @GetMapping("/categories")
    public List<Category> getAllCategoryItems() {
        return categoryService.getAllCategory();
    }
    @GetMapping("/categories/{id}")
    public Category getCategoryById(@PathVariable(value = "id") int id) {
        return categoryService.getCategoryById(id);
    }

    @PostMapping("/categories")
    public Category addCategory(@RequestBody Category category) {
        return categoryService.addCategory(category);
    }
    @PutMapping("/categories")
    public Category updateCategory(@RequestBody Category category) {
        return categoryService.addCategory(category);
    }

    @DeleteMapping("/categories/{id}")
    public void deleteCategory(@PathVariable int id) {
        Category category = categoryService.getCategoryById(id);
        categoryService.deleteCategoryById(id);
    }

}
