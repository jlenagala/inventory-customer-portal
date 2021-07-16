package com.janani.inventoryCustomerPortal.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CategoryTest {
    @InjectMocks
    Category category;


    @BeforeEach
    void setUp() {
        category = new Category();
        category.setId(1);
        category.setType("test");
    }

    @Test
    void getId() {
        category.getId();
    }

    @Test
    void getType() {
        category.getType();
    }

    @Test
    void testEquals() {
        Object object = new Object();
        category.equals(object);
    }

    @Test
    void canEqual() {
        Object object = new Object();
        category.canEqual(object);
    }

    @Test
    void testHashCode() {
        category.hashCode();
    }

    @Test
    void testToString() {
        category.toString();
    }
}