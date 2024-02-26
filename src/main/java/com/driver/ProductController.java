package com.driver;

import java.util.ArrayList;
import java.util.List;

public class ProductController {
    private List<Product> products = new ArrayList<>();

    public void addProduct(String name, int quantity) {
        Product product = new Product(name, quantity);
        products.add(product);
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }

    public void updateProductQuantity(String name, int newQuantity) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                product.setQuantity(newQuantity);
                break;
            }
        }
    }
}