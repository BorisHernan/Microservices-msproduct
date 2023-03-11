package com.vallegrande.product.service;

import com.vallegrande.product.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> listados();
    Product crear(Product product);

    Product update(Product product);

    void delete (Integer id);

}
