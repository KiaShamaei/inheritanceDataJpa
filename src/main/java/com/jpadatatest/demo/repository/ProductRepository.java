package com.jpadatatest.demo.repository;

import com.jpadatatest.demo.entity.ProductBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductBase , Long> {
    @Query("from ProductBase ")
    List<ProductBase> findAll();
}
