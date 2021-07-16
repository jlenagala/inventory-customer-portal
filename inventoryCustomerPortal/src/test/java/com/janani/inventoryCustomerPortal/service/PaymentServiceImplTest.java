package com.janani.inventoryCustomerPortal.service;

import com.janani.inventoryCustomerPortal.model.Item;
import com.janani.inventoryCustomerPortal.model.Payment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PaymentServiceImplTest {
@InjectMocks
PaymentService paymentService;
@Mock
Item item;
    @Mock
    Payment payment;
    @BeforeEach
    void setUp() {

    }


}