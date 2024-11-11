package com.ps;

import java.util.ArrayList;

public class Order {
    private ArrayList<Product> product;

    public Order(ArrayList<Product> product) {
        this.product = product;
    }

    public ArrayList<Product> getProduct() {
        return product;
    }
}
