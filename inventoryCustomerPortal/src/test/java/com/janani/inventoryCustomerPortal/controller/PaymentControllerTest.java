package com.janani.inventoryCustomerPortal.controller;

import com.janani.inventoryCustomerPortal.model.Item;
import com.janani.inventoryCustomerPortal.model.Payment;
import com.janani.inventoryCustomerPortal.service.PaymentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PaymentControllerTest {
    @InjectMocks
    PaymentController paymentController;
    @Mock
    PaymentService paymentService;
    @Mock
    Item item;


    @BeforeEach
    void setUp() {
    }

    @Test
    void calculateTotalAmount() {
        paymentController.calculateTotalAmount(item,1);
    }
}