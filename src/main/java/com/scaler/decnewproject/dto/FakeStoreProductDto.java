package com.scaler.decnewproject.dto;

import com.scaler.decnewproject.models.Category;
import com.scaler.decnewproject.models.Products;

public class FakeStoreProductDto {
    private Long id;
    private String title;
    private Double price;
    private String description;
    private String category;
    private String image;

    public Products getProducts() {
        Products products = new Products();
        products.setId(id);
        products.setTitle(title);
        products.setPrice(price);
        products.setDescription(description);
        products.setImageUrl(image);

        Category cat = new Category();
        cat.setTitle(category);
        products.setCategory(cat);

        return products;

    }

}







