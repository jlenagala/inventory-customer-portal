package com.janani.inventoryCustomerPortal.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ItemTest {
@InjectMocks
Item item;
@Mock
Category category;
@Mock
Discount discount;
@Mock
Tax tax;

    @BeforeEach
    void setUp() {
        item=new Item();
        item.setId(1);
        item.setQuantity(3);
        item.setCategory(category);
        item.setDiscount(discount);
        item.setItemCode(111);
        item.setPrice(new BigDecimal(111));
        item.setTax(tax);

    }

    @Test
    void getId() {assertEquals(1,item.getId());
    }

    @Test
    void getItemCode() {assertEquals(111,item.getItemCode());
    }

    @Test
    void getQuantity() {assertEquals(3,item.getQuantity());
    }

    @Test
    void getPrice() {assertEquals(new BigDecimal(111),item.getPrice());
    }


    @Test
    void getTax() {assertEquals(tax,item.getTax());
    }

    @Test
    void getDiscount() {assertEquals(discount,item.getDiscount());
    }

    @Test
    void getCategory() {assertEquals(category,item.getCategory());
    }

    @Test
    void testEquals() {
        Object object=new Object();
        category.equals(object);
    }

    @Test
    void canEqual() {
        Object object=new Object();
        category.canEqual(object);
    }

    @Test
    void testHashCode() {
        category.hashCode();
    }
}