package com.ps;

import java.util.ArrayList;

public class Sandwich extends Product {
    private String breadType;
    private double size; // 4, 8, 12 price based on size
    private boolean toasted;
    private String cheese;
    private String meat;
    private boolean extraMeat;
    private boolean extraCheese;
    private ArrayList<Topping> toppings = new ArrayList<>();// Can have multiple toppings
    private double price;

    private double cheesePrice;
    private double extraCheesePrice;

    private double meatPrice;
    private double extraMeatPrice;



    public Sandwich(double price, String description, String name, String cheese, String meat) {
        super(price, description, name);
        this.cheese = cheese;
        this.meat = meat;
    }

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
            case 4:
                price = 5.50;
                cheesePrice = .75;
                extraCheesePrice = .30;
                meatPrice = 1.00;
                extraMeatPrice = .50;
                break;
            case 8:
                price = 7.00;
                cheesePrice = 1.00;
                extraCheesePrice = .60;
                meatPrice = 2.00;
                extraMeatPrice = 1.00;
                break;
            case 12:
                price = 8.50;
                cheesePrice = 1.25;
                extraCheesePrice = .90;
                meatPrice = 3.00;
                extraMeatPrice = 1.50;
                break;
            default:
                price = 0.00;
                break;
        }

        price += calculateToppingPrice();
        System.out.println("Sandwich Price: $ "+ price);// Displaying the price to user
    }

    private double calculateToppingPrice(){

        if (size == 4){
            return  1.00;
        }else if (size==8){
            return 2.00;
        }else if (size == 12){
            return 3.00;
        } return 0.00;
    }

    public Sandwich(){
        this(8.50, "",  "White", 12., false, false, false,new ArrayList<>() );
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

    public void addExtraMeat() {
        price += extraMeatPrice;
        extraMeat = true;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void addExtraCheese() {
        price += extraCheesePrice;
        extraCheese = true;
    }

    public ArrayList<Topping>getToppings() {
        return toppings;
    }

    public void addToppings(Topping topping) {
        toppings.add(topping);
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

    public String getCheese() {
        return cheese;
    }

    public void addCheese(String cheese) {
        this.cheese = cheese;
        price += cheesePrice;
    }

    public String getMeat() {
        return meat;
    }

    public void addMeat(String meat) {
        this.meat = meat;
        price += meatPrice;
    }

    @Override
    public double getPrice() {
        return price;
    }

//    @Override
//    public String getDescription() {
//        return breadType + " " + size + " inch sandwich "+ toppings + toasted;
//
//    }

    @Override
    public String getDescription() {
        String description = breadType + " " + size + " inch sandwich ";

        description += toasted ? " toasted" : " not toasted";

        // Let the user add topping, if any
        if (!toppings.isEmpty()) {
            description += " with toppings: ";

            for (int i = 0; i < toppings.size(); i++) {
                description += toppings.get(i).getName();
                if (i < toppings.size() - 1) {
                    description += ", ";
                }
            }
        }

        return description;
    }

    @Override
    public String getName() {
        return "Sandwich: " + breadType + " " + size + " inch sandwich "+ toasted;
    }

    public void setToppings(ArrayList<Topping> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", toppings=" + toppings +
                '}';
    }
}
