package com.curso.checkout.service.impl;

import com.curso.checkout.model.Checkout;
import com.curso.checkout.model.dto.Product;
import com.curso.checkout.service.ICheckoutService;
import com.curso.checkout.service.IProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CheckoutService implements ICheckoutService {
    @Autowired
    private IProductService productService;

    @Override
    public Checkout buildCheckout(List<String> productIds) {
        Double total = 0.0;
        for (String id : productIds) {
            Product product = productService.getProducts(id);
            System.out.println("Respuesta desde" + product.getInstance());
            total += product.getValue();
        }
        Checkout checkout = new Checkout("234","www.google.com",total.toString(),productIds);
        return checkout;
    }
}
