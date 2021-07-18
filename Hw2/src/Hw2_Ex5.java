/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           10 Jun 2021
 Assignment:     Homework #02 Exercise #05
 Version:        Java SE 11 (LTS)

 Description: Takes in user input for
 loan amount, number of years, and
 interest rate, and calculates the
 amortization schedule.

 *************************************/


public class Hw2_Ex5 {
    public static void main(String[] args) {
        int years;
        double loan, annualRate, monthly, interest, balance, monthInterest, monthPrincipal, total;
        java.util.Scanner input = new java.util.Scanner(System.in);

        // takes in user input
        System.out.print("Loan Amount: ");
        loan = input.nextDouble();;
        System.out.print("Number of Years: ");
        years = input.nextInt();
        System.out.print("Annual Interest Rate (%): ");
        annualRate = input.nextDouble();

        // calculations
        interest = (annualRate / 100.0);
        monthly = (loan * (interest / 12.0)) / (1.0 - Math.pow((1.0 + (interest / 12.0)), (-12 * years)));
        balance = loan;
        total = monthly * 12.0 * years;
        interest /= 12.0;

        // program output
        System.out.printf("\nMonthly Payment: %.2f\n", monthly);
        System.out.printf("Total Payment: %.2f\n", total);
        System.out.printf("\n%-12s %-12s %-12s %-12s \n", "Payment#", "Interest", "Principal", "Balance");
        for(int i = 1; i <= (years * 12); i++) {
            monthInterest = balance * interest;
            balance = balance - monthly + monthInterest;
            monthPrincipal = monthly - monthInterest;
            System.out.printf("%-12d %-12.2f %-12.2f %-12.2f \n", i, monthInterest, monthPrincipal, balance);
        }
    }
}
