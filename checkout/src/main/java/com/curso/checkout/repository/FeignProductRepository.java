package com.curso.checkout.repository;

import com.curso.checkout.model.dto.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(name = "p", url="http://localhost:8080")
public interface FeignProductRepository {
    @RequestMapping(method = GET, value = "/products")
    Product getProductById(@RequestParam String id);
}
