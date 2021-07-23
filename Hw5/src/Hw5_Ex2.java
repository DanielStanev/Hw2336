/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           23 Jul 2021
 Assignment:     Homework #05 Exercise #02
 Version:        Java SE 11 (LTS)

 Description: Sorts an Integer ArrayList

 *************************************/

public class Hw5_Ex2 {
    public static void main(String[] x) {
        // Creates an ArrayList and Scanner object
        java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>(5);
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Prompts and stores user input
        System.out.print("Please enter 5 integers: ");
        for (int i = 1; i <= 5; i++)
            list.add(input.nextInt());
        input.close();

        // Sorts list and prints to console
        sort(list);
        System.out.print(list);
    }
    public static void sort(java.util.ArrayList<Integer> list) {
        // Bubblesorts the list
        for (int i = 4; i > 0; i--)
            for (int j = 0; j < i; j++)
                // Swaps two values
                if (list.get(j) > list.get(j + 1)) {
                    list.add(j, list.get(j + 1));
                    list.remove(j + 2);
                }
    }
}
