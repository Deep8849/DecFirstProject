package com.scaler.decnewproject.service;

import com.scaler.decnewproject.dto.FakeStoreProductDto;
import com.scaler.decnewproject.exceptions.ProductNotFound;
import com.scaler.decnewproject.models.Products;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service("fakeStoreProductService")
public class fakeStoreProductService implements ProductService{
    //insight this Fake store is going to be third party service
    public RestTemplate restTemplate;

    public fakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Products getsingleproduct(long id) throws ProductNotFound {
        System.out.println("get FK product service");
       FakeStoreProductDto fakeStoreProductDto =
               restTemplate.getForObject("https://fakestoreapi.com/products/"+id, FakeStoreProductDto.class);
            // System.out.println(fakeStoreProductDto.toString());

             if (fakeStoreProductDto == null){
                    throw new ProductNotFound("Product Not Found with id " + id);

             }
        return fakeStoreProductDto.getProducts();
    }

    @Override
    public List<Products> getAllproducts() {
        return List.of();
    }

    @Override
    public Products createproduct(Long id, String title, String description, Double price, String category) {
        FakeStoreProductDto fakeStoreProductDto  = new FakeStoreProductDto();
//        fakeStoreProductDto.setId(id);
//        fakeStoreProductDto.setTitle(title);
//        fakeStoreProductDto.setDescription(description);
//        fakeStoreProductDto.setPrice(price);
//        fakeStoreProductDto.setCategory(category);
//
//        FakeStoreProductDto response = restTemplate.postForObject("https://fakestoreapi.com/products", fakeStoreProductDto, FakeStoreProductDto.class);
        return fakeStoreProductDto.getProducts();

    }
}
