/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           23 Jun 2021
 Assignment:     Homework #03 Exercise #01
 Version:        Java SE 11 (LTS)

 Description: Takes in a credit card
 number as a long int and checks if its
 valid. 

 *************************************/


public class Hw3_Ex1 {
    public static void main(String[] args) {
        long number;
        java.util.Scanner input = new java.util.Scanner(System.in);

        // takes in user input for credit card number
        System.out.print("Please enter a credit card number as a long integer: ");
        number = input.nextLong();

        // program output
        if (isValid(number))
            System.out.printf("%d is valid", number);
        else
            System.out.printf("%d is invalid", number);
    }

    // checks if credit card number is valid
    public static boolean isValid(long number){
        if (getSize(number) < 13 || getSize(number) > 16)
            return false;
        if (!(prefixMatched(number, 37) || prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 6)))
            return false;
        return ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);
    } // end isValid

    // sums up the double of every digit in even place
    public static int sumOfDoubleEvenPlace(long number){
        int sum = 0;

        number /= 10; // removes the odd place
        while (number > 0){
            sum += getDigit((int)(number % 10) * 2);
            number /= 100;
        }
        return sum;
    }// end sumOfDoubleEvenPlace

    // returns the sum of the last two digits of a number
    public static int getDigit(int number){
        if (number >= 10)
            number = (number % 10) + (number / 10);
        return number;
    } // end getDigit

    // sums up all the digits in odd places
    public static int sumOfOddPlace(long number){
        int sum = 0;

        while (number > 0) {
            sum += (int)(number % 10);
            number /= 100;
        }
        return sum;
    } // end sumOfOddPlace

    // checks if number has prefix d
    public static boolean prefixMatched(long number, int d){
        return (d == getPrefix(number, getSize(d)));
    } // end prefixMatched

    // counts the number of digits in a number
    public static int getSize(long d) {
        for (int i = 1; i <= 16; i++)
            if (d - Math.pow(10, i) < 0)
                return i;
        return 1;
    } // end getSize

    // gets the first k digits of number
    public static long getPrefix(long number, int k){
        if (k >= getSize(number))
            return number;
        return (long)(number / Math.pow(10, getSize(number) - k));
    } // end getPrefix
}
