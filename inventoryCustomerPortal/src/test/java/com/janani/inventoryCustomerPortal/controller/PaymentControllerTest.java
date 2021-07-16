package com.janani.inventoryCustomerPortal.controller;

import com.janani.inventoryCustomerPortal.model.Item;
import com.janani.inventoryCustomerPortal.model.Payment;
import com.janani.inventoryCustomerPortal.service.PaymentService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class PaymentControllerTest {
    @InjectMocks
    PaymentController paymentController;
    @Mock
    PaymentService paymentService;
    @Mock
    Item item;
    @Mock
    Payment payment;

}