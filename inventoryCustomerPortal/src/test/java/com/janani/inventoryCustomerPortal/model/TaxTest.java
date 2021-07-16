package com.janani.inventoryCustomerPortal.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TaxTest {
@InjectMocks
Tax tax;
    @BeforeEach
    void setUp() {
        tax=new Tax();
        tax.setId(1);
        tax.setItemList(new ArrayList<>());
        tax.setTaxRate(new BigDecimal(1));
        tax.setTaxStatus(Status.ADDED);

    }

    @Test
    void getId() {
        assertEquals(1,tax.getId());
    }

    @Test
    void getTaxRate() {
        assertEquals(new BigDecimal(1),tax.getTaxRate());
    }

    @Test
    void getItemList() {
        assertEquals(new ArrayList<>(),tax.getItemList());
    }

    @Test
    void testEquals() {
        Object object=new Object();
        tax.equals(object);
    }

    @Test
    void canEqual() {
        Object object=new Object();
        tax.canEqual(object);
    }

    @Test
    void testHashCode() {
        tax.hashCode();
    }

    @Test
    void testToString() {
        tax.toString();
    }
}