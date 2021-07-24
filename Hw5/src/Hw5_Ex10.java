/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           24 Jul 2021
 Assignment:     Homework #05 Exercise #10
 Version:        Java SE 11 (LTS)

 Description: Binary Search algorithm
 for a generic ArrayList.

 *************************************/

public class Hw5_Ex10 {
    public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
        int compare, interval;                  // Check for the current element and interval to the next check
        int index = ((list.length - 1) / 2);    // Current index to check
        int low = 0;                            // Lowest index key could be at
        int high = list.length - 1;             // Highest index key could be at

        do {
            compare = list[index].compareTo(key);
            if ((high - index) > (index - low))
                interval = ((high - index) / 2);
            else 
                interval = ((index - low) / 2);
            if (high - low == 2)            // To catch integer division errors on small intervals
                interval = 1;
            if (compare == 0)               // If current element equal to the key
                return index;
            if (compare > 0) {              // If current element is greater than key
                high = index;
                index -= interval;
            }
            else {                          // If current element is less than key
                low = index;
                index += interval;
            }
        } while (interval > 0);
        return -1;                          // If element is not found
    }
}
