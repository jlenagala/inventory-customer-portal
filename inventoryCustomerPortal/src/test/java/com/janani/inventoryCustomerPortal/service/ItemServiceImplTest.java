package com.janani.inventoryCustomerPortal.service;

import com.janani.inventoryCustomerPortal.model.Item;
import com.janani.inventoryCustomerPortal.repository.ItemRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ItemServiceImplTest {
    @InjectMocks
    ItemServiceImpl itemService;

    @Mock
    ItemRepository itemRepository;

    @Mock
    Item item1;
    @BeforeEach
    void setUp() {
    }

    @Test
    void getItemById() {
        Mockito.when(itemRepository.findById(1)).thenReturn(Optional.of(item1));
        itemService.getItemById(1);
    }
    @Test
    void getItemByIdElse() {
        itemService.getItemById(1);
    }
    @Test
    void getAllItems() {
        itemService.getAllItems();
    }

    @Test
    void addItem() {
        itemService.addItem(item1);
    }

    @Test
    void deleteItemById() {
        itemService.deleteItemById(1);
    }

    @Test
    void getAllTaxedItems() {
        itemService.getAllTaxedItems();
    }

    @Test
    void getAllDiscountedItems() {
        itemService.getAllDiscountedItems();
    }
}