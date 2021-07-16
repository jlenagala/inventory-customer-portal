package com.janani.inventoryCustomerPortal.service;

import com.janani.inventoryCustomerPortal.model.Discount;
import com.janani.inventoryCustomerPortal.repository.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DiscountServiceImpl implements DiscountService{
    @Autowired
    DiscountRepository discountRepository;
    @Override
    public List<Discount> getAllDiscunts() {
        return discountRepository.findAll().stream().filter(x->x.getDiscountStatus().equals("ADDED")).collect(Collectors.toList());
            //x.getExpiredDate().isAfter(LocalDateTime.now())).collect(Collectors.toList());
    }
}
