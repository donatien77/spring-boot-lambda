package org.donatien.web;

import lombok.AllArgsConstructor;
import org.donatien.entities.Product;
import org.donatien.repositories.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by macosmonterey on 27 Mar, 2024
 */
@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ProductRestController {

    private ProductRepository productRepository;
    @GetMapping("/products")
    public List<Product> productList(){
        return productRepository.findAll();
    }

    @GetMapping("/products/{id}")
    public Product productById(@PathVariable String id){
        return productRepository.findById(id).get();
    }
}
