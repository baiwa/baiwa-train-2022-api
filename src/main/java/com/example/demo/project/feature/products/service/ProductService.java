package com.example.demo.project.feature.products.service;

import com.example.demo.project.common.repository.ProductTaRepository;
import com.example.demo.project.feature.products.model.ProductModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductTaRepository productTaRepository;

    public List<ProductModel.Product> getAll(){
        List<ProductModel.Product> dataAll = new ArrayList<>();
        productTaRepository.findAll().forEach(data ->{
            ProductModel.Product resData = new ProductModel.Product();
            resData.setId(data.getId());
            resData.setProductName(data.getProductName());
            resData.setProductWeight(data.getProductWeight());
            resData.setProductPrice(data.getProductPrice());
            resData.setProductType(data.getProductType());
            resData.setProductBrand(data.getProductBrand());
            resData.setProductType(data.getProductType());
            dataAll.add(resData);
        });
        return dataAll;
    }


}
