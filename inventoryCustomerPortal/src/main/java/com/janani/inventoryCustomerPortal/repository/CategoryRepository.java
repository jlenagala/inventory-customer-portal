package com.janani.inventoryCustomerPortal.repository;

import com.janani.inventoryCustomerPortal.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
