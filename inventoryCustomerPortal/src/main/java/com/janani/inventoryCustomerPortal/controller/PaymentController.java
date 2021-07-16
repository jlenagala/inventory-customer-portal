package com.janani.inventoryCustomerPortal.controller;

import com.janani.inventoryCustomerPortal.model.Item;
import com.janani.inventoryCustomerPortal.model.Payment;
import com.janani.inventoryCustomerPortal.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
;

@RestController
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @PostMapping("/payments/{qty}")
    public Payment calculateTotalAmount(@RequestBody Item item,@PathVariable(value = "qty") int qty) {
        Payment payment = new Payment();
        return paymentService.calculateTotalAmount(item, payment,qty);
    }

}
