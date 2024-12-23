package com.scaler.decnewproject.service;

import com.scaler.decnewproject.exceptions.ProductNotFound;
import com.scaler.decnewproject.models.Category;
import com.scaler.decnewproject.models.Products;
import com.scaler.decnewproject.repository.CategoryReposetory;
import com.scaler.decnewproject.repository.ProductReposetory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service("SelfProductService")
public class SelfProductService implements ProductService {
    private ProductReposetory produdctreposetory;
    private CategoryReposetory categoryReposetory;

    public SelfProductService(ProductReposetory produdctreposetory, CategoryReposetory categoryReposetory) {
        this.produdctreposetory = produdctreposetory;
        this.categoryReposetory = categoryReposetory;
    }

    @Override
    public Products getsingleproduct(long id) throws ProductNotFound {
    Optional<Products> p = produdctreposetory.findById(id);

    if (p.isPresent()) {
        return p.get();
    }

    throw  new ProductNotFound("Product is not found in our database");
    }

    @Override
    public List<Products> getAllproducts() {
        return List.of();
    }

    @Override
    public Products createproduct(Long id, String title, String description, Double price, String categoryTitle) {
        // 1. Check is the category is there in DB
        // 2. if not there, create it and use it while saving product
        // 3. if there use it in product directly
        Products p = new Products();

        Optional<Category> currentcat = categoryReposetory.findByTitle(categoryTitle);
        if (currentcat.isEmpty()) {
            Category newcat = new Category(categoryTitle);
            newcat.setTitle(categoryTitle);
            Category newrow = categoryReposetory.save(newcat);
            p.setCategory(newrow);
        }
        else {
            Category currentCategory = currentcat.get();
            p.setCategory(currentCategory);
        }
        p.setId(id);
        p.setTitle(title);
        p.setDescription(description);
        p.setPrice(price);
        Products saveproduct = produdctreposetory.save(p);
        return saveproduct;
    }
}
