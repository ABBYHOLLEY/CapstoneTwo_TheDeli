package com.ps;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    static Scanner inputScanner = new Scanner(System.in);
    static Scanner commandScanner = new Scanner(System.in);

    private static Order order = new Order();
    Sandwich sandwich = new Sandwich();

    public static void mainMenu(){
        int homeScreenCommand = 0;
        do {
            System.out.println("Welcome to Delicious ordering system!");
            System.out.println("What would you like to do?");
            System.out.println("1) Start a new order");
            System.out.println("0) Exit");
            System.out.println("Enter your command: ");

            try {
                homeScreenCommand =
                        commandScanner.nextInt();
            } catch (InputMismatchException ime){
                System.out.println("Invalid. Please select correct menu option!");
                commandScanner.nextLine();
                homeScreenCommand = 0;
            }
            switch (homeScreenCommand){
                case 1:
                    startNewOrder();
                    break;
                case 0:
                    System.out.println("Exiting...");
                default:
                    System.out.println("Command not found! Please try again. ");
            }

        }while (homeScreenCommand !=0);
    }
    // Main order menu
    public static void startNewOrder(){
        int newOrderCommand = 0;
        do {
            System.out.println("Hello! What would you like to add to your order?");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order..");
            try {
                newOrderCommand = commandScanner.nextInt();

            }catch (InputMismatchException ime){
                System.out.println("Invalid. Please try again.");
                commandScanner.nextLine();
                newOrderCommand = 0;
            }
            switch (newOrderCommand){
                case 1:
                    addSandwich();
                    break;
                case 2:
                    addDrink();
                    break;
                case 3:
                    addChips();
                    break;
                case 4:
                    checkout();
                    break;
                case 0:
                    System.out.println("Cancelling order.....");
                default:
                    System.out.println("Command not found. Please try again!");

            }

        }while (newOrderCommand !=0);

    }
    // Sandwich portion of nested menu
    public static void addSandwich(){
        int sandwichMenuCommand = 0;
        do {
            System.out.println("Please create you sandwich!");
            System.out.println("1) Select your bread");
            System.out.println("2) Select your sandwich size");
            System.out.println("3) Select your toppings(Meat, Cheese, Extras, Sauces)");
            System.out.println("4) Would you like the sandwich toasted? (Y)es (N)o");
            System.out.println("0) Exit to main menu");

            try { sandwichMenuCommand = commandScanner.nextInt();

            }catch (InputMismatchException ime){
                System.out.println("Invalid. Please try again!");
                commandScanner.nextLine();

            }switch (sandwichMenuCommand){
                case 1:
                    selectBread();
                    break;
                case 2:
                    selectSize();
                    break;
                case 3:
                    selectToppings();
                    break;
                case 4:
                    toasted();
                    break;
                case 0:
                    System.out.println("Going back to main menu....");
                default:
                    System.out.println("Command not found. Please try again!");

            }
        }while (sandwichMenuCommand != 0);
    }
    public static void selectBread(){
        System.out.println("Select your bread type:");
        System.out.println("1)White");
        System.out.println("2)Wheat");
        System.out.println("3)Sourdough");
        System.out.println("Please enter your choice: ");

        int breadChoice = commandScanner.nextInt();
        switch (breadChoice){
            case 1:
                System.out.println("White bread selected.");
                break;
            case 2:
                System.out.println("Wheat bread selected.");
                break;
            case 3:
                System.out.println("Sourdough bread selected.");
                break;
            default:
                System.out.println("Invalid, try again.");
        }
    }
    public static void selectSize(){
        System.out.println("What size sandwich would you like?");
        System.out.println("4) 4 inch sandwich");
        System.out.println("8) 8 inch sandwich");
        System.out.println("12) 12 inch sandwich");
        System.out.println("Please enter your choice:");

        int sandwichSizeChoice = commandScanner.nextInt();
        switch (sandwichSizeChoice){
            case 4:
                System.out.println("4 inch");
                break;
            case 8:
                System.out.println("8 inch");
                break;
            case 12:
                System.out.println("12 inch");
                break;
            default:
                System.out.println("Invalid. Please try again.");
        }
    }
    public static void selectToppings(){
        System.out.println("What vegetable toppings would you like?");
        System.out.println("Selection: ");

        String[] toppingNames = {
                "lettuce","peppers","onions","tomatoes","jalapenos","cucumbers","pickles","guacamole","mushrooms"
        };
        String selectedToppings = "";
        int toppingSelectionCommand;

        do {
            for (int i=0;i<toppingNames.length;i++){
                System.out.println(i+1+")"+toppingNames[i]);
            }
            System.out.println("0) Done");
            toppingSelectionCommand = commandScanner.nextInt();
            if (toppingSelectionCommand != 0) {
                if (toppingSelectionCommand >= 1 && toppingSelectionCommand <= toppingNames.length) {
                    String selectedTopping = toppingNames[toppingSelectionCommand - 1];
                    if (selectedToppings.isEmpty()) {
                        selectedToppings = selectedTopping;
                    } else {
                        selectedToppings += "," + selectedTopping;
                    }
                    System.out.println(selectedToppings + " has been added to sandwich.");
                } else {
                    System.out.println("Invalid. Please try again.");
                }
            }
        }while (toppingSelectionCommand != 0);
        System.out.println("These toppings have been added to your sandwich!"+ selectedToppings);
    }
    public static void toasted(){
        System.out.println("Would you like your bread toasted?");
    }
    // Add-ons and checkout
    public static void addDrink(){
        System.out.println("Would you like to add a drink?");
        System.out.println("What size drink would you like?");
        System.out.println("Selection: ");

//        System.out.println("addDrink");
        String[] drinkNames = {
                "Dr.Pepper", "Sprite", "Hi-C","Power-ade", "Lemonade","Iced Tea", "Coke"
        };
        int drinkSelectionCommand;

        do {
            for (int i=0;i<drinkNames.length;i++){
                System.out.println(i+1+")"+ drinkNames[i]);
            }
            System.out.println("0) Done");
            drinkSelectionCommand = commandScanner.nextInt();
            if (drinkSelectionCommand != 0){
                int index = drinkSelectionCommand-1;
                order.addDrink(drinkNames[index]);
            }
        }while (drinkSelectionCommand != 0);
    }

    public static void addChips(){
        System.out.println("Would you like to add Delicious kettle cooked chips for $1.50?");
        System.out.println("Selection: ");
        String[] chipNames = {
                "Original", "Salt and Vinegar","Barbeque","Pickle","Jalapeno"
        };
        int chipSelectionCommand;
        do {
            for (int i=0;i<chipNames.length;i++){
                System.out.println(i+1+")"+ chipNames[i]);
            }
            System.out.println("0) Done");
            chipSelectionCommand = commandScanner.nextInt();
            if (chipSelectionCommand != 0){
                int index = chipSelectionCommand-1;
                order.addBagOfChips(chipNames[index]);
            }
        }while (chipSelectionCommand !=0);


    }
    public static void checkout(){
        int checkoutMenuCommand = -1;
        do {
            System.out.println("Thank you for visiting Delicious! Would you like to confirm your order?");
            System.out.println("1) Confirm Order!");
            System.out.println("0) Cancel order and return to home screen. ");
        try {
            checkoutMenuCommand = commandScanner.nextInt();
            } catch (InputMismatchException ime){
            System.out.println("Invalid. Please try again.");
            commandScanner.nextLine();
        }switch (checkoutMenuCommand){
                case 1:
                    confirmOrder();
                    break;
                case 0:
                    System.out.println("Cancelling order and returning to home screen...");
        }
        }while (checkoutMenuCommand != 0);
    }
    public static void confirmOrder(){}
}
