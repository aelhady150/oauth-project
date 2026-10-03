package com.inventory.investory_service.Repositories;

import com.inventory.investory_service.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {

}
