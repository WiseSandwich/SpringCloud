package com.curso.checkout.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String id;
    private String notebook;
    private double value;
    private String instance;
}
