/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           23 Jun 2021
 Assignment:     Homework #03 Exercise #05
 Version:        Java SE 11 (LTS)

 Description: Takes in user input for
 an array of numbers. The first entry
 is a pivot and is moved to a position
 so that all preceding numbers are less
 and all following numbers are larger.

 *************************************/

public class Hw3_Ex5 {
    public static void main(String[] args) {
        int size;
        int array[];
        java.util.Scanner input = new java.util.Scanner(System.in);

        // takes in user input
        System.out.print("Enter list of integers (The first number determines the size and isn't part of the list): ");
        size = input.nextInt();

        // generates array, I use the 0th element as a way to store the size
        array = new int[size + 1];
        array[0] = size;
        for(int i = 1; i <= size; i++)
            array[i] = input.nextInt();

        // program output
        partition(array);
        System.out.print("After the partition, the list is");
        for (int i = 1; i <= array[0]; i++)
            System.out.printf(" %d", array[i]);
    }

    // moves all elements smaller than pivot before it
    public static int partition(int[] list) {
        int index = 1, temp;

        // partitions the array
        for (int i = 1; i <= list[0]; i++)
            // if the ith element is smaller than the pivot it puts it before pivot and moves other elements up
            if (list[i] < list[index] && i > index) {
                temp = list[index];
                list[index] = list[i];
                for (int j = i; j > index + 1; j--)
                    list[j] = list[j - 1];
                list[++index] = temp;
            }
        return index;
    } // end partition
}
