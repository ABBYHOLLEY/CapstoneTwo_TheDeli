package com.ps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    static Scanner inputScanner = new Scanner(System.in);
    static Scanner commandScanner = new Scanner(System.in);
    public static void mainMenu(){
        int homeScreenCommand;
        do {
            System.out.println("Welcome to Delicious!");
            System.out.println("What would you like to do?");
            System.out.println("1) Start a new order");
            System.out.println("0) Exit");
            System.out.println("Enter your command: ");

            try {
                homeScreenCommand =
                        commandScanner.nextInt();
            } catch (InputMismatchException ime){
                System.out.println("Invalid. Please select correct menu option!");
                ime.printStackTrace();
                commandScanner.nextInt();
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
    public static void startNewOrder(){

    }
}
