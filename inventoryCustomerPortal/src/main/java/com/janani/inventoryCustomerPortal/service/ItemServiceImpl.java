package com.janani.inventoryCustomerPortal.service;

import com.janani.inventoryCustomerPortal.model.Discount;
import com.janani.inventoryCustomerPortal.model.Item;
import com.janani.inventoryCustomerPortal.model.Status;
import com.janani.inventoryCustomerPortal.repository.DiscountRepository;
import com.janani.inventoryCustomerPortal.repository.ItemRepository;
import com.janani.inventoryCustomerPortal.repository.TaxRepository;
import org.hibernate.engine.jdbc.batch.spi.Batch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private TaxRepository taxRepository;
    @Autowired
    private DiscountRepository discountRepository;

    @Override
    public Item getItemById(int id) {
        Optional<Item> item = itemRepository.findById(id);
        if (item.isPresent()) {
            return item.get();
        } else {
            return null;
        }
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public void deleteItemById(int id) {
        itemRepository.deleteById(id);

    }

    @Override
    public List<Item> getAllTaxedItems() {
        BigDecimal total = null;
        List<Item> itemList = itemRepository.getAllTaxedItems().stream().filter(x -> x.getTax().getTaxStatus().equals(Status.ADDED)).collect(Collectors.toList());

        return itemList;
    }

    @Override
    public List<Item> getAllDiscountedItems() {
        List<Item> itemList = itemRepository.getAllDiscountedItems().stream().filter(x -> x.getDiscount().getDiscountStatus().equals(Status.ADDED)).collect(Collectors.toList());

        return itemList;
    }



   /* @Override
    public BigDecimal getPayment() {
        BigDecimal total = null;
        List<Item> itemList = itemRepository.getAllDiscountedItems().stream().filter(x -> x.getDiscount().getDiscountStatus().equals(Status.ADDED)).collect(Collectors.toList());

        return itemList;
    }*/

}
