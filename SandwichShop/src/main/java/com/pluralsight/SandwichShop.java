package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double regularSandwich = 5.45;
        double largeSandwich = 8.95;
        double sandwichCost = 0;
        double discount;

        System.out.println("What size sandwich do you 1 Regular or 2 large");
        String userChoice = scan.nextLine();

        System.out.println("How old are you?");
        int age = scan.nextInt();

        if(userChoice.equals("1")) {
            if(age <= 17) {
                discount = regularSandwich * 0.1;
                sandwichCost = regularSandwich - discount;
                System.out.println("Sandwich costs $" + sandwichCost);
            } else if(age >= 65) {
                discount = regularSandwich * 0.2;
                sandwichCost = regularSandwich - discount;
                System.out.println("Sandwich costs $" + sandwichCost);
            } else {
                sandwichCost = regularSandwich;
                System.out.println("Sandwich costs $" + sandwichCost);
            }
        } else if(userChoice.equals("2")) {
            if(age <= 17) {
                discount = largeSandwich * 0.1;
                sandwichCost = largeSandwich - discount;
                System.out.println("Sandwich costs $" + sandwichCost);
            } else if(age >= 65) {
                discount = regularSandwich * 0.2;
                sandwichCost = largeSandwich - discount;
                System.out.println("Sandwich costs $" + sandwichCost);
            } else {
                sandwichCost = largeSandwich;
                System.out.println("Sandwich costs $" + sandwichCost);
            }
        }

    }
}
