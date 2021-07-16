package com.janani.inventoryCustomerPortal.service;

import com.janani.inventoryCustomerPortal.model.Item;

import java.util.List;


public interface ItemService {
    Item getItemById(int id);

    List<Item> getAllItems();

    Item addItem(Item item);

    void deleteItemById(int id);

    List<Item> getAllTaxedItems();

    List<Item> getAllDiscountedItems();


}
