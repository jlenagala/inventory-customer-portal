package com.janani.inventoryCustomerPortal.controller;

import com.janani.inventoryCustomerPortal.model.Discount;
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
    @Mock
    Discount discount;

    @Test
    void getAllDiscountedItems() {
        discountController.getAllDiscountedItems();
    }

    @Test
    void getDiscountById() {
        discountController.getDiscountById(1);
    }

    @Test
    void addDiscounts() {
        discountController.addDiscounts(discount);
    }

    @Test
    void updateDiscounts() {
        discountController.updateDiscounts(discount);
    }

    @Test
    void deleteDiscount() {
        discountController.deleteDiscount(1);
    }
}