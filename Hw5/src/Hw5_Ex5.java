/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           23 Jul 2021
 Assignment:     Homework #05 Exercise #05
 Version:        Java SE 11 (LTS)

 Description: Finds fibonacci number
 at given index.

 *************************************/

public class Hw5_Ex5 {
    public static void main(String[] x) {
        // Objects and Variables
        int index;
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Prompts and stores user input
        do {
            System.out.print("Enter index of fibonacci number: ");
            index = input.nextInt();
            if (index <= 0)
                System.out.println("Invalid index, try again.");
        } while (index <= 0);
        input.close();

        // Prints out fibonacci number at requested index
        System.out.printf("The fibonacci number at index %d is %d", index, fib(index));
    }
    public static int fib(int n) {
        // Initializes an array to store fibonacci numbers
        int[] array = new int[n];
        array[0] = 1;
        array[1] = 1;

        // Generates fibonacci numbers
        for (int i = 2; i < n; i++)
            array[i] = array[i - 1] + array[i - 2];
        return array[n - 1];
    }
}
