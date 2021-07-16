package com.janani.inventoryCustomerPortal.repository;

import com.janani.inventoryCustomerPortal.model.Item;
import com.janani.inventoryCustomerPortal.model.Payment;
import com.janani.inventoryCustomerPortal.service.PaymentService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
    //Payment findByItem(Item item);
}
