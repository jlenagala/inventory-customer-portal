package com.janani.inventoryCustomerPortal.controller;

import com.janani.inventoryCustomerPortal.model.Category;
import com.janani.inventoryCustomerPortal.model.Item;
import com.janani.inventoryCustomerPortal.model.Payment;
import com.janani.inventoryCustomerPortal.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @PostMapping("/payments/{qty}")
    public Payment calculateTotalAmount(@RequestBody Item item,@PathVariable(value = "qty") int qty) {
        Payment payment = new Payment();
        return paymentService.calculateTotalAmount(item, payment,qty);
    }
    @GetMapping("/payments")
    public List<Payment> getAllPayment() {
        return paymentService.getAllPayment();
    }
    @GetMapping("/payment/{id}")
    public Payment getPaymentById(@PathVariable(value = "id") int id) {
        return paymentService.getPaymentById(id);
    }

    @PostMapping("/payments")
    public Payment addPayment(@RequestBody Payment payment) {
        return paymentService.addPayment(payment);
    }
    @PutMapping("/payments")
    public Payment updatePayment(@RequestBody Payment payment) {
        return paymentService.addPayment(payment);
    }

    @DeleteMapping("/payments/{id}")
    public void deletePayment(@PathVariable int id) {
        Payment payment = paymentService.getPaymentById(id);
        paymentService.deletePaymentById(id);
    }
}
