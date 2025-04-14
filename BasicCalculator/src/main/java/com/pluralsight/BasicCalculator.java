package com.pluralsight;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scan.nextInt();

        System.out.println("Select an operator + - * /");
        char mathOperator = scan.next().charAt(0);

        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();

        int result = 0;

        switch(mathOperator) {
            case '+':
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num1 == 0 || num2 == 0) {
                    System.out.println("Error cannot divide by zero");
                }
                result = num1 / num2;
            default:
                System.out.println("You broke something bro!!");
        }


        System.out.printf("%d %c %d = %d", num1, mathOperator, num2, result);
    }
}
