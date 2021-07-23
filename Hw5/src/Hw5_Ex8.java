/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           23 Jul 2021
 Assignment:     Homework #05 Exercise #08
 Version:        Java SE 11 (LTS)

 Description: Recursively converts a
 given hexadecimal String into a
 decimal integer.

 *************************************/

public class Hw5_Ex8 {
    public static void main(String[] x) {
        // Creates Scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Prompts user for a hexadecimal number and displays the decimal equivalent
        System.out.print("Enter a hexadecimal number: ");
        System.out.printf("The decimal equivalent is: %d", hex2Dec(input.next()));
        input.close();
    }
    public static int hex2Dec(String hex) {
        // Decimal value of current digit
        int value;

        if (hex.length() == 0) // Returns 0 if no digits left to process
            return 0;
        if (hex.charAt(0) >= 'A' && hex.charAt(0) <= 'F')      // Digits A through F are equal to 10 through 15
            value = hex.charAt(0) - 55;
        else if (hex.charAt(0) >= 'a' && hex.charAt(0) <= 'f') // In case input is lower case
            value = hex.charAt(0) - 87;
        else                                                   // For digits 0 through 9
            value = hex.charAt(0) - 48;

        value *= Math.pow(16, hex.length() - 1); // The powers of 16 run in opposite direction of the indexes
        return value + hex2Dec(hex.substring(1)); // Returns the value of the digit and processes the remaining digits
    }
}
