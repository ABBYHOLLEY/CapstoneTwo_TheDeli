package com.ps;

import java.util.ArrayList;

public class Order {
    private ArrayList<Product> products;

    public Order() {
        this.products = new ArrayList<>();
    }

    public ArrayList<Product> getProduct() {
        return products;
    }

    public void addBagOfChips(String bagOfChipsName) {
        BagOfChips bagOfChips = new BagOfChips();
        products.add(bagOfChips);
    }
    public void addDrink(Drink drink) {
        products.add(drink);
    }

    public void addSandwich(Sandwich sandwich) {
        products.add(sandwich);
    }
}

