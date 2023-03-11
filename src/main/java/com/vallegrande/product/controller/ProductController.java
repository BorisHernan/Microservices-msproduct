package com.vallegrande.product.controller;

import com.vallegrande.product.model.Product;
import com.vallegrande.product.respository.ProductRespository;
import com.vallegrande.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ms-product/v1/products/validos")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> listar() {
        return productService.listados();
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productService.crear(product);
    }

    @PutMapping
    public Product update(@RequestBody Product product) {
        return productService.update(product);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        productService.delete(id);
    }
}
