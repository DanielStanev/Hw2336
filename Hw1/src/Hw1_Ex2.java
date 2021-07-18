/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           10 Jun 2021
 Assignment:     Homework #01 Exercise #02
 Version:        Java SE 11 (LTS)

 Description: Takes in the first nine
 digits of an ISBN-10 and calculates
 the tenth.

 *************************************/

public class Hw1_Ex2 {
    public static void main(String[] args) {
        // declaring all variables and objects used in program
        int d10 = 0;
        String isbn;
        java.util.Scanner input = new java.util.Scanner(System.in);

        // takes in user input for the first 9 digits of an ISBN number
        System.out.print("Enter the first 9 digits of an ISBN as an integer: ");
        isbn = input.next();

        // calculates the tenth digit of the ISBN-10 number
        for(int i = 0; i < 9; i++)
            d10 += (isbn.charAt(i) - '0')*(i + 1);
        d10 %= 11;

        // prints out the ISBN-10 number
        if (d10 == 10)
            System.out.print("The ISBN-10 number is " + isbn + 'X');
        else
            System.out.printf("The ISBN-10 number is " + isbn + "%d", d10);
    }
}
