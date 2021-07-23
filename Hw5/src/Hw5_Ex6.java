/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           23 Jul 2021
 Assignment:     Homework #05 Exercise #06
 Version:        Java SE 11 (LTS)

 Description: Reverses a given integer.

 *************************************/

public class Hw5_Ex6 {
    public static void main(String[] x) {
        // Creates a Scanner Object
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Prompts user for input and prints it in reverse
        System.out.print("Enter an integer: ");
        reverseDisplay(input.nextInt());
        input.close();
    }
    public static void reverseDisplay(int n) {
        // Creates a StringBuilder object
        StringBuilder display = new StringBuilder();

        // Special case if n is 0;
        if (n == 0)
            System.out.print("0");

        // Adds a negative sign in front if n is negative
        if (n < 0) {
            display.append('-');
            n *= -1;
        }

        // Reverses n and prints the result to the console
        for (; n > 0; n /= 10)
            display.append(n % 10);
        System.out.print(display);
    }
}
