package com.shopping.golddigger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.shopping.golddigger.entity.Product;
import com.shopping.golddigger.repository.ProductRepository;


    @Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public Product addProduct(Product product) {
        // add an employee
        return productRepository.save(product);
    }
    public Product getProductById(Long id) throws NotFoundException{
        // get employee by id
        if(productRepository.findById(id)==null){
            throw new NotFoundException();
        }
        return productRepository.findById(id).orElse(null);
       }
       public List<Product> getProductByCategory(String Category) throws NotFoundException{
        // get employee by id
        if(productRepository.findByCategory(Category)==null){
            throw new NotFoundException();
        }
        return productRepository.findByCategory(Category);
       }
      
    public List<Product> getAllProducts() {
        // return all employees
        return productRepository.findAll();
    }
}
    

