package com.ps;

import java.util.ArrayList;
import java.util.List;

public class Sandwich extends Product {
    private String breadType;
    private double size; // 4, 8, 12 price is based on size
    private boolean isToasted;
    private boolean extraMeat;
    private boolean extraCheese;
    private ArrayList<Topping> toppings;// Can have multiple toppings
    private double price;

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Sandwich(double price, String description, String breadType, double size, boolean isToasted, boolean extraMeat, boolean extraCheese, ArrayList<Topping> toppings) {
        super(0.00, "Sandwich");//Place holders
        this.breadType = breadType;
        this.size = size;
        this.isToasted = isToasted;
        this.extraMeat = extraMeat;
        this.extraCheese = extraCheese;
        this.toppings = toppings;
        this.price = price;
        calculatePrice();
    }

    public Sandwich() {

    }

    private void calculatePrice(){
        size = price;


    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
        calculatePrice();
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
        calculatePrice();
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
        calculatePrice();
    }
    public ArrayList<Topping> getToppings() {
        return toppings;
    }
    public void setToppings(ArrayList<Topping> toppings) {
        this.toppings = toppings;
        calculatePrice();//Calculate price when toppings change
    }
}
