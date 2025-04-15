package com.pluralsight;
import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double baseRentalPerDay = 29.99;
        double rentalCost = 0;
        double under25Charge = 0.3;
        double allOptions = 0;
        double totalCost = 0;

        System.out.println("Pickup date?");
        String pickupDate = scanner.nextLine();

        System.out.println("How many days will you have the rental?");
        int numOfDays = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Do you want an electronic toll tag at $3.95/day (yes/no)?");
        String tollTag = scanner.nextLine();

        System.out.println("Do you want a GPS at $2.95/day (yes/no)?");
        String gpsCharge = scanner.nextLine();

        System.out.println("Do you want roadside assistance at $3.95/day (yes/no)?");
        String roadSide = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        if(tollTag.equals("yes")) {
            allOptions += 3.95 * numOfDays;
        }
        if(gpsCharge.equals("yes")) {
            allOptions += 2.95 * numOfDays;
        }
        if (roadSide.equals("yes")) {
            allOptions += 3.95 * numOfDays;
        }


        if(age < 25) {
            baseRentalPerDay += baseRentalPerDay * under25Charge;
            rentalCost = baseRentalPerDay * numOfDays;
            totalCost = rentalCost + allOptions;
            System.out.printf("Rental will be picked up on %s \n Basic car rental is $%.2f\n options cost is $%.2f\n The underage driver surchage is $%.2f\n Total cost is $%.2f",
                    pickupDate, rentalCost, allOptions, baseRentalPerDay, totalCost);
        } else {
            rentalCost = baseRentalPerDay * numOfDays;
            totalCost = rentalCost + allOptions;
            System.out.printf("Rental will be picked up on %s \n Basic car rental is $%.2f\n options cost is $%.2f\n Not an underage driver daily car rental is $%.2f\n Total cost is $%.2f",
                    pickupDate, rentalCost, allOptions, baseRentalPerDay, totalCost);
        }

    }
}
