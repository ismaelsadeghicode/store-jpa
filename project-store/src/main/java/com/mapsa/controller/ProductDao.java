package com.mapsa.controller;


import com.mapsa.model.Product;

import java.util.List;

/**
 * @author Esmaeil Sadeghi, 8/6/20 11:56 PM
 */
public interface ProductDao {

    List<Product> findAllProduct();

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);
}
