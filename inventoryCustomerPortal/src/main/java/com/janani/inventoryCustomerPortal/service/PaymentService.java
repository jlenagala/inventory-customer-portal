package com.janani.inventoryCustomerPortal.service;

import com.janani.inventoryCustomerPortal.model.Item;
import com.janani.inventoryCustomerPortal.model.Payment;

import java.math.BigDecimal;

public interface PaymentService {


    Payment calculateTaxedPrice(Item item,Payment payment);

    Payment calculateTotalAmount(Item item,Payment payment,int qty);
}
