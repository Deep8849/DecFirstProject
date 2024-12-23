package com.scaler.decnewproject.service;

import com.scaler.decnewproject.exceptions.ProductNotFound;
import com.scaler.decnewproject.models.Products;

import java.util.List;

public interface ProductService {
    Products getsingleproduct(long id ) throws ProductNotFound;
    List<Products> getAllproducts();
    Products createproduct(Long id, String title, String description, Double price, String category);
}
