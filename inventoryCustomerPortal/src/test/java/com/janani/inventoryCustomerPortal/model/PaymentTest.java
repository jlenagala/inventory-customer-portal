package com.janani.inventoryCustomerPortal.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {
@InjectMocks
Payment payment;
    @BeforeEach
    void setUp() {
    payment=new Payment();
    payment.setId(1);
    payment.setQuanttity(1);
    payment.setPaymentStatus(Status.ADDED);
    payment.setItemId(1);
    payment.setAmount(new BigDecimal(1));
    }

    @Test
    void getId() {assertEquals(1,payment.getId());
    }

    @Test
    void getAmount() {assertEquals(new BigDecimal(1),payment.getAmount());
    }

    @Test
    void getItemId() {assertEquals(1,payment.getItemId());
    }

    @Test
    void getQuanttity() {assertEquals(1,payment.getQuanttity());
    }


    @Test
    void testEquals() {Object object=new Object();
    payment.equals(object);
    }

    @Test
    void canEqual() {
        Object object=new Object();
        payment.canEqual(object);
    }

    @Test
    void testHashCode() {
        payment.hashCode();
    }

    @Test
    void testToString() {
        payment.toString();
    }
}