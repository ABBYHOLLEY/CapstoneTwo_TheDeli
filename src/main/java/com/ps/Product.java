package com.ps;

public abstract class Product implements Buyable{
    public double price;
    public String description;
    public String name;

    public Product(double price, String description, String name) {
        this.price = price;
        this.description = description;
        this.name = name;
    }

    public Product() {
        // Default constructor
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public abstract String getName();
}
