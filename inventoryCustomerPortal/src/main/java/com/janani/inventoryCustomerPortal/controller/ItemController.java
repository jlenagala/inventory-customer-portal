package com.janani.inventoryCustomerPortal.controller;

import com.janani.inventoryCustomerPortal.model.Item;
import com.janani.inventoryCustomerPortal.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/items/{id}")
    public Item getItemById(@PathVariable(value = "id") int id) {
        return itemService.getItemById(id);
    }

    @GetMapping("/items")
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @PostMapping("/items")
    public Item addItem(@RequestBody Item item) {
        return itemService.addItem(item);
    }

    @PutMapping("/items")
    public Item updateItem(@RequestBody Item item) {
        return itemService.addItem(item);
    }

    @DeleteMapping("/items/{id}")
    public void deleteItems(@PathVariable int id) {
        Item item = itemService.getItemById(id);
        itemService.deleteItemById(id);
    }

    @GetMapping("/taxitems")
    public List<Item> getAllTaxedItems() {
        return itemService.getAllTaxedItems();
    }

    @GetMapping("/discountitems")
    public List<Item> getAllDiscountedItems() {
        return itemService.getAllDiscountedItems();
    }


}
