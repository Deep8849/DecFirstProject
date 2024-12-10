package com.scaler.decnewproject.service;

import com.scaler.decnewproject.models.Products;

import java.util.List;

public interface ProductService {
    Products getsingleproduct(long id );
    List<Products> getAllproducts();
    Products createproduct(Products product);
}
