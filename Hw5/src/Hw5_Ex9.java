/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           24 Jul 2021
 Assignment:     Homework #05 Exercise #09
 Version:        Java SE 11 (LTS)

 Description: Linear Search algorithm
 for a generic ArrayList.

 *************************************/

public class Hw5_Ex9 {
    public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
        for (int i = 0; i < list.length; i++)
            if (list[i].equals(key)) // Return on first search hit
                return i;
        return -1; // If the element is not in the ArrayList
    }
}
