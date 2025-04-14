package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name");
        String name = scan.nextLine();

        System.out.println("How many hours of back breaking work did you do last week?");
        float hoursWorked = scan.nextFloat();

        System.out.println("How much do they pay you to be away from your family?");
        float payRate = scan.nextFloat();

        float result = hoursWorked * payRate;

        System.out.printf("The good man %s made %.2f last week.", name, result);
        

    }
}
