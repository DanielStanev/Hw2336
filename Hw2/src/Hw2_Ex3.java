/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           10 Jun 2021
 Assignment:     Homework #02 Exercise #03
 Version:        Java SE 11 (LTS)

 Description: Takes in user input for
 employee information and prints a
 payroll statement.

 *************************************/


public class Hw2_Ex3 {
    public static void main(String[] args) {
        double hours, pay, fedTax, stateTax;
        double gross, fedWithhold, stateWithhold;
        String name;
        java.util.Scanner input = new java.util.Scanner(System.in);

        // collects user input for employee info
        System.out.print("Enter employee's name: ");
        name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        pay = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        fedTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        stateTax = input.nextDouble();

        // some calculations to make printf's less lengthy
        gross = hours * pay;
        fedWithhold = hours * pay * fedTax;
        stateWithhold = hours * pay * stateTax;

        // prints out payroll statement
        System.out.println("\nEmployee Name: " + name);
        System.out.printf("Hours Worked: %.1f\n", hours);
        System.out.printf("Pay Rate: $%.2f\n", pay);
        System.out.printf("Gross Pay: $%.2f\n", gross);
        System.out.println("Deductions:");
        System.out.printf("\tFederal Withholding (%.2f%%): $%.2f\n", (100 * fedTax), fedWithhold);
        System.out.printf("\tState Withholding (%.2f%%): $%.2f\n",(100 * stateTax), stateWithhold);
        System.out.printf("\tTotal Deduction: $%.2f\n", fedWithhold + stateWithhold);
        System.out.printf("Net Pay: $%.2f\n", gross - (fedWithhold + stateWithhold));
    }
}
