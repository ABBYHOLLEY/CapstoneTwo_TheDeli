package com.ps;

public class Product implements Buyable{
    private double price;
    private String description;

    public Product(double price, String description) {
        this.price = price;
        this.description = description;
    }

    public Product() {

    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
