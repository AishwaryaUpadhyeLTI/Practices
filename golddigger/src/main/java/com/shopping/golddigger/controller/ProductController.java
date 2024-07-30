package com.shopping.golddigger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.golddigger.entity.Product;
import com.shopping.golddigger.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
    

    @Autowired
    private ProductService productService;
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        // return all employee with httpstaus OK
        List<Product> product=productService.getAllProducts();
        return new ResponseEntity<>(product,HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) throws NotFoundException {
        // return employee by id with httpstatus ok
        Product emp=productService.getProductById(id);
        return ResponseEntity.ok(emp);
        // if employee not found return httpstatus notfound
    }
    @GetMapping("/category/{category}")
    public ResponseEntity<List<Product>> getProductByCategory(@PathVariable String category) throws NotFoundException {
        // return employee by id with httpstatus ok
        List<Product> emp=productService.getProductByCategory(category);
        return ResponseEntity.ok(emp);
        // if employee not found return httpstatus notfound
    }
    
    @PostMapping
    public ResponseEntity<Product>  addProduct(@RequestBody Product product) {
       // add an employee and return added employee with httpstatus ok
       Product e=productService.addProduct(product);
       return new ResponseEntity<Product>(e, HttpStatus.OK);
       
    }
}
 
    

