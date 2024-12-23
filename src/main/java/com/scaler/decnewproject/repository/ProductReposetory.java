package com.scaler.decnewproject.repository;

import com.scaler.decnewproject.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductReposetory extends JpaRepository<Products, Long> {
    //save
    //get
    //getAll
    //update

    //This will insert the products record in my product table
    Products save(Products products);

    // select * from Products where title = title
    Products findBytitle(String title);
    //delete


    Products findBydescription(String description);
}
