package com.ps;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private String bread;
    private String size; // 4, 8, 12
    private boolean extraMeat;
    private boolean extraCheese;
    private ArrayList<Topping> toppings;// Can have multiple toppings

    public Sandwich(String bread, boolean extraCheese, String size, boolean extraMeat, ArrayList<String> toppings) {
        this.bread = bread;
        this.extraCheese = extraCheese;
        this.size = size;
        this.extraMeat = extraMeat;
        this.toppings = new ArrayList<>();
    }

    public String getBread() {
        return bread;
    }

    public String getSize() {
        return size;
    }

    public boolean hasExtraMeat() {
        return extraMeat;
    }

    public boolean hasExtraCheese() {
        return extraCheese;
    }

    public List<Topping> getToppings() {
        return this.toppings;
    }
}
