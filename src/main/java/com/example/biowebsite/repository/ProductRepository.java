package com.example.biowebsite.repository;

import com.example.biowebsite.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByCategory_Id(int id);
    @Query("SELECT p FROM Product p WHERE LOWER(p.name) LIKE :productName")
    List<Product> searchProductsByName(@Param("productName") String productName);
}
