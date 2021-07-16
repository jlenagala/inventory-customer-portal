package com.janani.inventoryCustomerPortal.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DiscountTest {
    @InjectMocks
    Discount discount;
private List<Item> itemList;

    @BeforeEach
    void setUp() {
        discount=new Discount();
        discount.setDiscountStatus(Status.ADDED);
        discount.setDiscountRate(new BigDecimal(1));
        discount.setExpiredDate(LocalDateTime.now());
        discount.setId(1);
        discount.setItemList(itemList);
        discount.setDiscountRate(new BigDecimal(1));
        discount.setStartDate(LocalDateTime.now());
    }

    @Test
    void getId() {
        assertEquals(1,discount.getId());
    }

    @Test
    void getDiscountRate() {
        assertEquals(new BigDecimal(1),discount.getDiscountRate());
    }

    @Test
    void getExpiredDate() {//assertEquals(LocalDateTime.now(),discount.getExpiredDate());
    }

    @Test
    void getStartDate() {//assertEquals(LocalDateTime.now(),discount.getExpiredDate());
    }

    @Test
    void getDiscountStatus() {assertEquals(1,discount.getId());
    }

    @Test
    void getItemList() {assertEquals(1,discount.getId());
    }

    @Test
    void testEquals() {
        Object object=new Object();
        discount.equals(object);
    }

    @Test
    void canEqual() {

        Object object=new Object();
        discount.canEqual(object);
    }

    @Test
    void testHashCode() {
        discount.hashCode();
    }

    @Test
    void testToString() {
        discount.toString();
    }
}