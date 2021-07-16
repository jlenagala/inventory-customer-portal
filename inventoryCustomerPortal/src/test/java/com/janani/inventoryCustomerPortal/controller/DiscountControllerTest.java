package com.janani.inventoryCustomerPortal.controller;

import com.janani.inventoryCustomerPortal.service.DiscountService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DiscountControllerTest {
    @InjectMocks
    DiscountController discountController;
    @Mock
    DiscountService discountService;

    @Test
    void getAllDiscountedItems() {
        discountController.getAllDiscountedItems();
    }
}