package com.janani.inventoryCustomerPortal.controller;

import com.janani.inventoryCustomerPortal.model.Item;
import com.janani.inventoryCustomerPortal.service.ItemService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ItemControllerTest {
    @InjectMocks
    ItemController itemController;
    @Mock
    ItemService itemService;
@Mock
Item item;
    @BeforeEach
    void setUp() {
    }

    @Test
    void getItemById() {
        itemController.getItemById(1);
    }

    @Test
    void getAllItems() {
        itemController.getAllItems();
    }

    @Test
    void addItem() {
        itemController.addItem(item);
    }

    @Test
    void updateItem() {
        itemController.updateItem(item);
    }

    @Test
    void deleteItems() {
        itemController.deleteItems(1);
    }

    @Test
    void getAllTaxedItems() {
        itemController.getAllTaxedItems();
    }

    @Test
    void getAllDiscountedItems() {
        itemController.getAllDiscountedItems();
    }
}