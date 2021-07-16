package com.janani.inventoryCustomerPortal.controller;

import com.janani.inventoryCustomerPortal.model.Discount;
import com.janani.inventoryCustomerPortal.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiscountController {
    @Autowired
    DiscountService discountService;
    @GetMapping("/discounts")
    public List<Discount> getAllDiscountedItems() {
        return discountService.getAllDiscunts();
    }


}
