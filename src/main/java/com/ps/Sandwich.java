package com.ps;

import java.util.ArrayList;

public class Sandwich extends Product {
    private String breadType;
    private double size; // 4, 8, 12 price based on size
    private boolean toasted;
    private boolean extraMeat;
    private boolean extraCheese;
    private ArrayList<Topping> toppings; // Can have multiple toppings
    private double price;

    private double extraMeatPrice4 = 0.50;
    private double extraMeatPrice8 = 1.00;
    private double extraMeatPrice12 = 1.50;

    private double extraCheesePrice4 = 0.30;
    private double extraCheesePrice8 = 0.60;
    private double extraCheesePrice12 = 0.90;

    public Sandwich(double price, String description, String breadType, double size, boolean toasted, boolean extraMeat, boolean extraCheese, ArrayList<Topping> toppings) {
        super(0, "Custom Sandwich", "Sandwich"); //
        this.breadType = breadType;
        this.size = size;
        this.extraMeat = extraMeat;
        this.extraCheese = extraCheese;
        this.toppings = new ArrayList<>();
        this.toasted = false;
        calculatePrice(); // calculate price for the size and extras
    }

    private void calculatePrice() {
        // price based on size
        switch ((int) size) {
            case 4: price = 5.50; break;
            case 8: price = 7.00; break;
            case 12: price = 8.50; break;
        }
        if (extraMeat) {
            if (size == 4) price += extraMeatPrice4;
            if (size == 8) price += extraMeatPrice8;
            if (size == 12) price += extraMeatPrice12;
        }
        if (extraCheese) {
            if (size == 4) price += extraCheesePrice4;
            if (size == 8) price += extraCheesePrice8;
            if (size == 12) price += extraCheesePrice12;
        }
    }
    public Sandwich(){
        this(8.00, "",  "White", 12.00, false, false, false,new ArrayList<>() );
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
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isToasted(){
        return toasted;
    }
    public void setToasted(boolean toasted){
        this.toasted = toasted;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return breadType + " " + size + " inch sandwich"+ toasted;
    }
    @Override
    public String getName() {
        return "Sandwich: " + breadType + " " + size + " inch"+ toasted;
    }
}
