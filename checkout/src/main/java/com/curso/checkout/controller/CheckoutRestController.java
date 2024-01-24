package com.curso.checkout.controller;

import com.curso.checkout.model.Checkout;
import com.curso.checkout.service.ICheckoutService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/checkout")
public class CheckoutRestController {

    @Autowired
    private ICheckoutService checkoutService;

    @GetMapping()
    public Checkout getCheckout(@RequestParam List<String> productIds, @RequestHeader("X-Request-From") String requestFrom, @RequestHeader() Map<String,String> headers) {
        System.out.println("Enviado desde: "+requestFrom);
        if(!requestFrom.equals("gateway")){
            return null;
        }
        return checkoutService.buildCheckout(productIds);
    }
    @GetMapping("/{id}")
    public Checkout getById(@PathVariable String id){
        return new Checkout(id);
    }
}
