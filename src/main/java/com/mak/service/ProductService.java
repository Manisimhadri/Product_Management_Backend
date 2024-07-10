package com.mak.service;

import com.mak.model.Product;

import java.util.List;

public interface ProductService {

    Product saveProduct(Product product);

    List<Product> getAllProduct();

    Product getProductById(Integer id);

    String deleteProduct(Integer id);
}
