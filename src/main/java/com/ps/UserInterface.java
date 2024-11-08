package com.ps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    static Scanner inputScanner = new Scanner(System.in);
    static Scanner commandScanner = new Scanner(System.in);

    public static void mainMenu(){
        int homeScreenCommand = -1;
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
                homeScreenCommand = -1;
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
        int newOrderCommand = -1;
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
                newOrderCommand = -1;
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
        int sandwichMenuCommand = -1;
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
    public static void selectBread(){}
    public static void selectSize(){}
    public static void selectToppings(){}
    public static void toasted(){}

    // Add-ons and checkout
    public static void addDrink(){}
    public static void addChips(){}
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
