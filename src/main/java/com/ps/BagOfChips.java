package com.ps;

public class BagOfChips extends Product{
    private String name;
    private double price;

    public BagOfChips(){
        this.name = "Bag of Chips";
        this.price = 1.50;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "BagOfChips{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
