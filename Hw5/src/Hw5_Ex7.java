/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           23 Jul 2021
 Assignment:     Homework #05 Exercise #07
 Version:        Java SE 11 (LTS)

 Description: Recursively converts a
 given decimal integer into a
 binary String.

 *************************************/

public class Hw5_Ex7 {
    public static void main(String[] x) {
        // Creates a Scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Prompts user for a decimal number and converts it to binary
        System.out.print("Enter a decimal number to convert to binary: ");
        System.out.print("The binary equivalent is: " + dec2Bin(input.nextInt()));
        input.close();
    }
    public static String dec2Bin(int n) {
        // Recursively converts a decimal number into a binary String
        if (n <= 1)
            return "" + n;
        return dec2Bin(n/2) + (n % 2);
    }
}
