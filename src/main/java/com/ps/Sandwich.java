package com.ps;

import java.util.ArrayList;
import java.util.List;

public class Sandwich extends Product {
    private String breadType;
    private int size; // 4, 8, 12
    private boolean isToasted;
    private boolean extraMeat;
    private boolean extraCheese;
    private ArrayList<Topping> toppings;// Can have multiple toppings

    public Sandwich(double price, String description, String breadType, int size, boolean isToasted, boolean extraMeat, boolean extraCheese, ArrayList<Topping> toppings) {
        super(price, description);
        this.breadType = breadType;
        this.size = size;
        this.isToasted = isToasted;
        this.extraMeat = extraMeat;
        this.extraCheese = extraCheese;
        this.toppings = toppings;
        calculatePrice();
    }
    private void calculatePrice(){

    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }
    public ArrayList<Topping> getToppings() {
        return toppings;
    }
    public void setToppings(ArrayList<Topping> toppings) {
        this.toppings = toppings;
        calculatePrice();
    }
}
