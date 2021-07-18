/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           23 Jun 2021
 Assignment:     Homework #03 Exercise #03
 Version:        Java SE 11 (LTS)

 Description: Eliminates duplicates in
 an array of 10 numbers

 *************************************/

public class Hw3_Ex3 {
    public static void main(String[] args) {
        int array[] = new int[10];
        int distinctArray[];
        java.util.Scanner input = new java.util.Scanner(System.in);

        // takes in user input
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++)
            array[i] = input.nextInt();

        // program output
        distinctArray = eliminateDuplicates(array); // generates array of distinct numbers
        System.out.printf("The distinct numbers are: %d", distinctArray[0]);
        for (int i = 1; i < 10; i++) {
            if (distinctArray[i] == distinctArray[0])
                break;
            System.out.printf(" %d", distinctArray[i]);
        }
    }

    // generates array of unique numbers from given array
    public static int[] eliminateDuplicates(int[] list) {
        int distinct[] = new int[10];
        boolean duplicate = false;
        int index = 0;

        // generates array of unique numbers
        distinct[0] = list[0];
        for(int i = 1; i < 10; i++) {
            duplicate = false;
            // checks if number is unique
            for (int j = 0; j < i; j++)
                if (list[i] == distinct[j])
                    duplicate = true;
            if (duplicate)
                continue;
            index++;
            distinct[index] = list[i];
        }
        // if there are not 10 unique numbers i use the first number again as a stopping point
        if (index != 9)
            distinct[++index] = distinct[0];
        return distinct;
    } // end eliminateDuplicates
}
