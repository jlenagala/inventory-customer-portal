package com.janani.inventoryCustomerPortal.service;

import com.janani.inventoryCustomerPortal.model.Discount;
import com.janani.inventoryCustomerPortal.model.Item;

import java.util.List;

public interface DiscountService {
    List<Discount> getAllDiscunts();

    Discount getDiscountById(int id);

    Discount adddiscounts(Discount discount);

    void deleteDiscountById(int id);
}
