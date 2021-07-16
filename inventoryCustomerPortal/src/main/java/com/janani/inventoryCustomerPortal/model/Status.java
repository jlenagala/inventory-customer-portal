package com.janani.inventoryCustomerPortal.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {
    ADDED("ADDED"),
    EXPIRED("EXPIRED");
    private final String discountStatus;
}
