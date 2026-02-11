package com.hirushan.microservices.product.controller;

import com.hirushan.microservices.product.dto.ProductRequest;
import com.hirushan.microservices.product.model.Product;
import com.hirushan.microservices.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {
        return productService.createProduct(productRequest);
        // Implementation for creating a product
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();
        // Implementation for retrieving all products
    }

}
