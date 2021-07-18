/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           10 Jun 2021
 Assignment:     Homework #01 Exercise #01
 Version:        Java SE 11 (LTS)

 Description: Takes is user input for
 the coefficients of a second degree
 polynomial and solves for the real
 roots.

 *************************************/

public class Hw1_Ex1 {
    public static void main(String[] args){
        double a, b, c; // polynomial coefficients
        double discriminant, r1, r2; // discriminant and roots of polynomial
        java.util.Scanner input = new java.util.Scanner(System.in); // scanner

        // takes in user input for coefficients
        System.out.print("Enter a, b, c: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        discriminant = ((b*b) - (4*a*c)); // calculates discriminant

        // calculates and displays the number of roots of the polynomial
        if (discriminant < 0) {
            System.out.print("The equation has no real roots\n");
        }
        else if (discriminant == 0) {
            r1 = (-1 * b) / (2 * a);
            System.out.printf("The equation has a double root at x = %f", r1);
        }
        else {
            r1 = ((-1 * b) + Math.pow(discriminant, 0.5)) / (2 * a);
            r2 = ((-1 * b) - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.printf("The equation has two roots at x = %f and x = %f", r1, r2);
        }
    }
}
