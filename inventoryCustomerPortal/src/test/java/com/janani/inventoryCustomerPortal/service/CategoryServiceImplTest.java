package com.janani.inventoryCustomerPortal.service;

import com.janani.inventoryCustomerPortal.model.Category;
import com.janani.inventoryCustomerPortal.repository.CategoryRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CategoryServiceImplTest {
    @InjectMocks
    CategoryServiceImpl categoryService;
    @Mock
    Category category;
    @Mock
    CategoryRepository categoryRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getAllCategory() {
        categoryService.getAllCategory();
    }

    @Test
    void getCategoryById() {
        categoryService.getCategoryById(1);

    }

    @Test
    void addCategory() {
        categoryService.addCategory(category);
    }

    @Test
    void deleteCategoryById() {
        categoryService.deleteCategoryById(1);
    }
}