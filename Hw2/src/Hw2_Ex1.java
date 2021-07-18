/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           10 Jun 2021
 Assignment:     Homework #02 Exercise #01
 Version:        Java SE 11 (LTS)

 Description: Takes in a year and a
 month and prints out the number of
 days in that month.

 *************************************/

public class Hw2_Ex1 {
    public static void main(String[] args) {
        int year;
        String month;
        java.util.Scanner input = new java.util.Scanner(System.in);

        // collects user input for year
        System.out.print("Enter a year: ");
        year = input.nextInt();

        // collects user input for year
        System.out.print("Enter the first 3 letters of a month: ");
        month = input.next();

        switch(month) {
            // these months have 31 days
            case "Jan" :
            case "Mar" :
            case "May" :
            case "Jul" :
            case "Aug" :
            case "Oct" :
            case "Dec" :
                System.out.printf(month + " %d has 31 days\n", year);
                break;
            // these months have 30 days
            case "Apr" :
            case "Jun" :
            case "Sep" :
            case "Nov" :
                System.out.printf(month + " %d has 30 days\n", year);
                break;
            // special case for leap years
            case "Feb" :
                if (year % 4 == 0) {
                    // end of century years are not leap years unless they are divisible by 400 in Gregorian calendar
                    if (year % 100 != 0 || year % 400 == 0)
                        System.out.printf("Feb %d has 29 days\n", year);
                    else
                        System.out.printf("Feb %d has 28 days\n", year);
                }
                else
                    System.out.printf("Feb %d has 28 days\n", year);
                break;
            default :
                System.out.print("Invalid Month\n");
                break;
        }
    }
}
