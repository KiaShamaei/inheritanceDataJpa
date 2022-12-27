package com.jpadatatest.demo.service;

import com.jpadatatest.demo.entity.ProductBase;
import com.jpadatatest.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<ProductBase> findAllProduct(){
        return  productRepository.findAll();
    }
    public void addProduct(ProductBase productBase){
        productRepository.save(productBase);
    }
}
