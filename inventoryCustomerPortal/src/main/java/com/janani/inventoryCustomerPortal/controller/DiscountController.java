package com.janani.inventoryCustomerPortal.controller;

import com.janani.inventoryCustomerPortal.model.Discount;
import com.janani.inventoryCustomerPortal.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DiscountController {
    @Autowired
    DiscountService discountService;
    @GetMapping("/discounts")
    public List<Discount> getAllDiscountedItems() {
        return discountService.getAllDiscunts();
    }
    @GetMapping("/discounts/{id}")
    public Discount getDiscountById(@PathVariable(value = "id") int id) {
        return discountService.getDiscountById(id);
    }

    @PostMapping("/discounts")
    public Discount addDiscounts(@RequestBody Discount discount) {
        return discountService.adddiscounts(discount);
    }

    @PutMapping("/discounts")
    public Discount updateDiscounts(@RequestBody Discount discount) {
        return discountService.adddiscounts(discount);
    }

    @DeleteMapping("/discounts/{id}")
    public void deleteDiscount(@PathVariable int id) {
        Discount discount = discountService.getDiscountById(id);
        discountService.deleteDiscountById(id);
    }


}
