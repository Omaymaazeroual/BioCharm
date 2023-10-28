package com.example.biowebsite.service;

import com.example.biowebsite.model.Category;
import com.example.biowebsite.model.Product;
import com.example.biowebsite.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {


    @Autowired
    ProductRepository productRepository;
    public List<Product> getAllCategory(){ return productRepository.findAll();}
    public void addProduct(Product product){
        productRepository.save(product);
    }
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
    public void removeProductsById(long id){
        productRepository.deleteById(id);
    }
    public Optional<Product> getProductById(long id){
        return productRepository.findById(id);
    }
    public List<Product> getAllProductsByCategoryId(int id){
        return productRepository.findAllByCategory_Id(id);
    }


    public List<Product> searchProductsByName(String productName) {
        return productRepository.searchProductsByName("%" + productName.toLowerCase() + "%");
    }

}
