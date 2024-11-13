package com.ps;

public class Drink extends Product {
    private String drinkSize;

    public Drink(double price, String name, String description, String drinkSize) {
        super(price, name, description);
        this.drinkSize = drinkSize;
    }

    public String getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(String drinkSize) {
        this.drinkSize = drinkSize;
    }
    @Override
    public double getPrice() {
        return price; // Price comes from the Product class
    }

    @Override
    public String getDescription() {
        return description + " (" + drinkSize + ")"; // Combine description with the size of the drink
    }

    @Override
    public String getName() {
        return name; // Return the name of the drink
    }
}

