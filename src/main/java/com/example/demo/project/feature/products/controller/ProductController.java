package com.example.demo.project.feature.products.controller;

import com.example.demo.project.feature.products.model.ProductModel;
import com.example.demo.project.feature.products.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping("/get-all")
    public ResponseEntity<List<ProductModel.Product>>getAll(){
        return ResponseEntity.ok(productService.getAll());
    }
}
