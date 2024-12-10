package com.scaler.decnewproject.controller;

import com.scaler.decnewproject.models.Products;
import com.scaler.decnewproject.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public void CreateProducts(Products product){

    }
    @GetMapping("products/{id}")
    public Products getProductByid(@PathVariable("id") Long id){
        productService.getsingleproduct(id);
      return null;
    }

    public void updateProduct(Products product){

    }

    public void deleteProduct(Long id){

    }
}
