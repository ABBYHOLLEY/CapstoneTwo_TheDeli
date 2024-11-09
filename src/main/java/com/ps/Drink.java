package com.ps;

public class Drink {
    private String getName;
    private double getPrice;

    public Drink(String getName, double getPrice) {
        this.getName = getName;
        this.getPrice = getPrice;
    }

    public String getGetName() {
        return getName;
    }

    public double getGetPrice() {
        return getPrice;
    }
}
