package com.driver;

import java.util.List;

public class ProductView {
    public void printProductDetails(List<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}