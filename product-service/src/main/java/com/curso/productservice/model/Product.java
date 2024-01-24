package com.curso.productservice.model;

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
