package com.scaler.decnewproject.service;

import com.scaler.decnewproject.models.Products;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class fakeStoreProductService implements ProductService{
    //insight this Fake store is going to be third party service
    @Override
    public Products getsingleproduct(long id) {
        System.out.println("getsingleproduct");
        return null;
    }

    @Override
    public List<Products> getAllproducts() {
        return List.of();
    }

    @Override
    public Products createproduct(Products product) {
        return null;
    }
}
