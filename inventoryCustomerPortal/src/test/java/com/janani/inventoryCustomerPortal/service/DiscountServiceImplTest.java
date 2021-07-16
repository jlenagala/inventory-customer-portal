package com.janani.inventoryCustomerPortal.service;

import com.janani.inventoryCustomerPortal.model.Discount;
import com.janani.inventoryCustomerPortal.model.Status;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DiscountServiceImplTest {
    @InjectMocks
    DiscountServiceImpl discountService;

    @Mock
    Status status;


}