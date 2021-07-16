package com.janani.inventoryCustomerPortal.service;

import com.janani.inventoryCustomerPortal.model.Discount;
import com.janani.inventoryCustomerPortal.repository.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DiscountServiceImpl implements DiscountService{
    @Autowired
    DiscountRepository discountRepository;
    @Override
    public List<Discount> getAllDiscunts() {
        return discountRepository.findAll().stream().filter(x->x.getDiscountStatus().equals("ADDED")).collect(Collectors.toList());
    }

    @Override
    public Discount getDiscountById(int id) {
        Optional<Discount> discount = discountRepository.findById(id);
        if (discount.isPresent()) {
            return discount.get();
        } else {
            return null;
        }
    }

    @Override
    public Discount adddiscounts(Discount discount) {
        return discountRepository.save(discount);
    }

    @Override
    public void deleteDiscountById(int id) {
        discountRepository.deleteById(id);
    }


}
