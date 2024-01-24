package com.curso.checkout.service;

import com.curso.checkout.model.Checkout;

import java.util.List;

public interface ICheckoutService {
    public Checkout buildCheckout(List<String> productIds);
}
