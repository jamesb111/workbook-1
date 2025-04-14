package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        int bobSalaryv = 75000;
        int garySalary = 250400;

        int highestSalary = Math.max(bobSalaryv, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        // question 2

        int carPrice = 45780;
        int truckPrice = 81200;

        System.out.println("Lowest car price is " + Math.min(carPrice, truckPrice));

        // question 3

        double area = Math.PI * Math.pow(7.25, 2);
        System.out.println("Area is " + area);

        // questin 4

        System.out.println("Square root is " + Math.sqrt(5.0));

        // question 5
        // (5, 10) and (85, 50)
        int x1 = 5;
        int x2 = 85;
        int y1 = 10;
        int y2 = 50;

        int newX = x2 - x1;
        int newY = y2 - y1;

        System.out.println("Distance between points is " + Math.sqrt(Math.pow(newX, 2) + Math.pow(newY, 2)));

        // question 6
        System.out.println("The aboslute value is " + Math.abs(-3.8));

        //question 7
        System.out.println("Random number between 0 and 1 is " + Math.random());
    }
}
