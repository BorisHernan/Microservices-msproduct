package com.vallegrande.product.service.impl;

import com.vallegrande.product.model.Product;
import com.vallegrande.product.respository.ProductRespository;
import com.vallegrande.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRespository productRespository;

    @Override
    public List<Product> listados() {
        return productRespository.findAll();
    }

    @Override
    public Product crear(Product product) {
        return productRespository.save(product);
    }

    @Override
    public Product update(Product product) {
        return productRespository.save(product);
    }

    @Override
    public void delete(Integer id) {
        productRespository.deleteById(id);
    }
}
