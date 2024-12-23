package com.scaler.decnewproject.controller;

import com.scaler.decnewproject.dto.ErrorDto;
import com.scaler.decnewproject.exceptions.ProductNotFound;
import com.scaler.decnewproject.models.Products;
import com.scaler.decnewproject.service.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(@Qualifier("SelfProductService") ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/products")
    public Products CreateProducts(@RequestBody Products product){

//      Products p =  productService.createproduct(product.getId(), product.getTitle(),
//                product.getDescription(), product.getPrice(),
//                product.getCategory().getTitle());
//
//      return p;
        return null;
    }
    @GetMapping("products/{id}")
    public ResponseEntity<Products> getProductByid(@PathVariable("id") Long id) throws ProductNotFound {
//        System.out.println("starting the API here");
//       Products p = productService.getsingleproduct(id);
//       System.out.println("ending the API here");
//
//       ResponseEntity<Products> response = new ResponseEntity<>(
//               p, HttpStatus.OK
//        );
//      return response;
        return null;
    }

    public void updateProduct(Products product){

    }

    public void deleteProduct(Long id){

    }
    @ExceptionHandler(ProductNotFound.class)
    public ResponseEntity<ErrorDto> handleProductNotFoundException(Exception e){
//        ErrorDto errorDto = new ErrorDto();
//        errorDto.setMessage(e.getMessage());
//
//        ResponseEntity<ErrorDto> response = new ResponseEntity<>(
//                errorDto, HttpStatus.NOT_FOUND);
//
//        return response;
        return null;
    }
}
