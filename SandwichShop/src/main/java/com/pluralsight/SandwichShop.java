package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double regularSandwich = 5.45;
        double largeSandwich = 8.95;
        double sandwichCost = 0;
        double discount;
        double regLoaded = 1.00;
        double largeLoaded = 1.75;
        double result = 0;

        System.out.println("What size sandwich do you want 1 Regular or 2 large");
        String userChoice = scan.nextLine();

        System.out.println("How old are you?");
        int age = scan.nextInt();

        scan.nextLine();

        System.out.println("Would like that sandwich loaded? Yes or No");
        String loadedSandwich = scan.nextLine();

        if(userChoice.equals("1")) {
            if(age <= 17) {
                if(loadedSandwich.equals("yes")) {
                    discount = regularSandwich * 0.1;
                    sandwichCost = regularSandwich - discount;
                    result = sandwichCost + regLoaded;
                    System.out.printf("Your sandwich costs $%.2f", result);
                } else {
                    discount = regularSandwich * 0.1;
                    sandwichCost = regularSandwich - discount;
                    result = sandwichCost;
                    System.out.printf("Your sandwich costs $%.2f", result);
                }

            } else if(age >= 65) {
                if(loadedSandwich.equals("yes")) {
                    discount = regularSandwich * 0.2;
                    sandwichCost = regularSandwich - discount;
                    result = sandwichCost + regLoaded;
                    System.out.printf("Your sandwich costs $%.2f", result);

                } else {
                    discount = regularSandwich * 0.2;
                    sandwichCost = regularSandwich - discount;
                    result = sandwichCost;
                    System.out.printf("Your sandwich costs $%.2f", result);
                }

            } else {
                if(loadedSandwich.equals("yes")) {
                    sandwichCost = regularSandwich;
                    result = sandwichCost + regLoaded;
                    System.out.printf("Your sandwich costs $%.2f", result);

                } else {
                    sandwichCost = regularSandwich;
                    result = sandwichCost;
                    System.out.printf("Your sandwich costs $%.2f", result);
                }
            }
        } else if(userChoice.equals("2")) {
            if(age <= 17) {
                if(loadedSandwich.equals("yes")) {
                    discount = largeSandwich * 0.1;
                    sandwichCost = largeSandwich - discount;
                    result = sandwichCost + largeLoaded;
                    System.out.printf("Your sandwich costs $%.2f", result);

                } else {
                    discount = largeSandwich * 0.1;
                    sandwichCost = largeSandwich - discount;
                    result = sandwichCost;
                    System.out.printf("Your sandwich costs $%.2f", result);
                }
            } else if(age >= 65) {
                if(loadedSandwich.equals("yes")) {
                    discount = regularSandwich * 0.2;
                    sandwichCost = largeSandwich - discount;
                    result = sandwichCost + largeLoaded;
                    System.out.printf("Your sandwich costs $%.2f", result);

                } else {
                    discount = regularSandwich * 0.2;
                    sandwichCost = largeSandwich - discount;
                    result = sandwichCost;
                    System.out.printf("Your sandwich costs $%.2f", result);

                }

            } else {
                if(loadedSandwich.equals("yes")) {
                    sandwichCost = largeSandwich;
                    result = sandwichCost + largeLoaded;
                    System.out.printf("Your sandwich costs $%.2f", result);

                } else {
                    sandwichCost = largeSandwich;
                    result = sandwichCost;
                    System.out.printf("Your sandwich costs $%.2f", result);

                }

            }
        }

    }
}
