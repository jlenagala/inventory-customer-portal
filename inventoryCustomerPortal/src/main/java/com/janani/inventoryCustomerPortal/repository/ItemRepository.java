package com.janani.inventoryCustomerPortal.repository;

import com.janani.inventoryCustomerPortal.model.Discount;
import com.janani.inventoryCustomerPortal.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Integer> {
    @Query("SELECT a FROM Item a JOIN a.tax b")
    List<Item> getAllTaxedItems();

    @Query("SELECT a FROM Item a JOIN a.discount b")
    List<Item> getAllDiscountedItems();

    List<Item> findByDiscount(Discount discount);


}
