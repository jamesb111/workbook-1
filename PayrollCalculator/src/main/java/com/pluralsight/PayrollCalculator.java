package com.pluralsight;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {
            // file to pull from and write to
            System.out.println("Enter the name of the file employee file to process:");
            String fileName = scan.nextLine();
            System.out.println("Enter the name of the payroll file to create:");
            String newFile = scan.nextLine();

            FileReader fileReader = new FileReader("src/main/resources/" + fileName);
            BufferedReader bufReader = new BufferedReader(fileReader);

            FileWriter writer = new FileWriter("src/main/resources/" + newFile);
            BufferedWriter bufWriter = new BufferedWriter(writer);


            String input;
            bufWriter.write("Id|Name|Gross pay \n");
            while((input = bufReader.readLine()) != null) {
                String[] employeeParts = input.split("\\|");

               if(employeeParts[0].equals("id")) {
                    continue;
                }
                Employee newEmployee = new Employee(employeeParts[0], employeeParts[1],
                        Float.parseFloat(employeeParts[2]), Float.parseFloat(employeeParts[3]) );

                System.out.printf("Employee Id: %s \n Employee Name: %s \n Gross pay is: %f",
                        newEmployee.getEmployeeId(), newEmployee.getName(), newEmployee.getGrossPay());

                String lineforNewFile = newEmployee.getEmployeeId() + ", " + newEmployee.getName() +
                        ", " + newEmployee.getGrossPay() + "\n";


                bufWriter.write(lineforNewFile);

            }
            bufWriter.close();
            bufReader.close();
        } catch (Exception e){
            throw new RuntimeException(e);
        }

        //Old code----------------------------------
       /* Scanner scan = new Scanner(System.in);

        System.out.println("What is your name");
        String name = scan.nextLine();

        System.out.println("How many hours of back breaking work did you do last week?");
        float hoursWorked = scan.nextFloat();

        System.out.println("How much do they pay you to be away from your family?");
        float payRate = scan.nextFloat();

        float result = hoursWorked * payRate;

        System.out.printf("The good man %s made %.2f last week.", name, result);
        */

    }
}
