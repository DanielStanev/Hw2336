/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           23 Jun 2021
 Assignment:     Homework #03 Exercise #04
 Version:        Java SE 11 (LTS)

 Description: Takes in user input for
 an array and checks if its sorted.

 *************************************/

public class Hw3_Ex4 {
    public static void main(String[] args) {
        int size;
        double array[];
        java.util.Scanner input = new java.util.Scanner(System.in);

        // prompts user for input
        System.out.print("Enter list (The first number determines the size and isn't part of the list): ");
        size = input.nextInt();

        // generates array, I use the 0th element as a way to store the size
        array = new double[size + 1];
        array[0] = size;
        for(int i = 1; i <= size; i++)
            array[i] = input.nextDouble();

        // program output
        if(isSorted(array))
            System.out.print("The list is already sorted");
        else
            System.out.print("The list is not sorted");
    }

    // checks if array is sorted
    public static boolean isSorted(double[] array) {
        boolean sorted = true;
        for(int i = 2; i <= array[0]; i++)
            if(array[i] < array[i - 1])
                sorted = false;
        return sorted;
    } // end isSorted
}
