package com.curso.checkout.service.impl;

import com.curso.checkout.model.dto.Product;
import com.curso.checkout.repository.FeignProductRepository;
import com.curso.checkout.service.IProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService implements IProductService {

    @Autowired
    private FeignProductRepository feignProductRepository;

    @Override
    public Product getProducts(String id) {
        return feignProductRepository.getProductById(id);
    }
}
