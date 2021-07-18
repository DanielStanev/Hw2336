/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           10 Jun 2021
 Assignment:     Homework #02 Exercise #04
 Version:        Java SE 11 (LTS)

 Description: Takes in user input for
 loan amount and loan period and
 calculates information based on interest
 rate.

 *************************************/

public class Hw2_Ex4 {
    public static void main(String[] args) {
        int years;
        double loan, monthly, interest, rate, total;
        java.util.Scanner input = new java.util.Scanner(System.in);

        // collects user input
        System.out.print("Loan Amount: ");
        loan = input.nextDouble();
        System.out.print("Number of Years: ");
        years = input.nextInt();

        // program output
        System.out.printf("%-15s %-15s %-15s \n", "Interest Rate", "Monthly Payment", "Total Payment");
        for(int i = 0; i < 25; i++) {
            interest = 5.0 + (.125 * i);
            rate = interest / 100.0;
            monthly = (loan * (rate / 12.0)) / (1.0 - Math.pow((1.0 + (rate / 12.0)) , (-12 * years)));
            total = (monthly * 12.0 * years);
            System.out.printf("%-5.3f%-10% $%-14.2f $%-14.2f\n", interest, monthly, total);
        }
    }
}
