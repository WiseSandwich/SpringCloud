package com.curso.checkout.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Checkout {

    private String id;
    private String url;
    private String totalAmount;
    private List<String> availableMethods;

    public Checkout(String id) {
        this.id = id;
    }

}
