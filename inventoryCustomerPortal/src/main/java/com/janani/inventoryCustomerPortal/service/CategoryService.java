package com.janani.inventoryCustomerPortal.service;

import com.janani.inventoryCustomerPortal.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategory();

    Category getCategoryById(int id);

    Category addCategory(Category category);

    void deleteCategoryById(int id);
}
