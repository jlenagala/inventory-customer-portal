package com.janani.inventoryCustomerPortal.controller;

import com.janani.inventoryCustomerPortal.model.Category;
import com.janani.inventoryCustomerPortal.service.CategoryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CategoryControllerTest {
    @InjectMocks
    CategoryController categoryController;
    @Mock
    CategoryService categoryService;
    @Mock
    Category category;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getAllCategoryItems() {
        categoryController.getAllCategoryItems();
    }

    @Test
    void getCategoryById() {
        categoryController.getCategoryById(1);
    }

    @Test
    void addCategory() {
        categoryController.addCategory(category);
    }

    @Test
    void updateCategory() {
        categoryController.updateCategory(category);
    }

    @Test
    void deleteCategory() {
        categoryController.deleteCategory(1);
    }
}