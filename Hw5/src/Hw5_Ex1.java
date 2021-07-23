/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           23 Jul 2021
 Assignment:     Homework #05 Exercise #01
 Version:        Java SE 11 (LTS)

 Description: Removes duplicates from
 an Integer ArrayList.

 *************************************/

public class Hw5_Ex1 {
    public static void main(String[] x) {
        // Creates an ArrayList and Scanner object
        java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>();
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Prompts and stores user input
        System.out.print("Please Enter 10 integers: ");
        for (int i = 1; i <= 10; i++)
            list.add(input.nextInt());
        input.close();

        // Removes duplicates and prints to console
        removeDuplicates(list);
        System.out.println(list);
    }
    public static void removeDuplicates(java.util.ArrayList<Integer> list) {
        java.util.ArrayList<Integer> newList = new java.util.ArrayList<Integer>();

        // Adds each Integer to a new list if it's not a duplicate
        for (Integer ele : list)
            if (!newList.contains(ele))
                newList.add(ele);
        // Clears the original list and replaces with the new list
        list.clear();
        list.addAll(newList);
    }
}