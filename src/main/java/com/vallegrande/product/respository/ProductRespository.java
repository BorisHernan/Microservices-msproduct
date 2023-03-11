package com.vallegrande.product.respository;

import com.vallegrande.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRespository  extends JpaRepository<Product,Integer> {
}
