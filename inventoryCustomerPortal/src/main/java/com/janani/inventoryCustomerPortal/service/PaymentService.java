package com.janani.inventoryCustomerPortal.service;

import com.janani.inventoryCustomerPortal.model.Item;
import com.janani.inventoryCustomerPortal.model.Payment;

import java.math.BigDecimal;
import java.util.List;

public interface PaymentService {


    Payment calculateTaxedPrice(Item item,Payment payment);

    Payment calculateTotalAmount(Item item,Payment payment,int qty);

    List<Payment> getAllPayment();

    Payment getPaymentById(int id);

    Payment addPayment(Payment payment);

    void deletePaymentById(int id);
}
