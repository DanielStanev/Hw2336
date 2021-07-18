/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           10 Jun 2021
 Assignment:     Homework #02 Exercise #02
 Version:        Java SE 11 (LTS)

 Description: Takes in a user input and
 checks if its a valid ssn number.

 *************************************/

public class Hw2_Ex2 {
    public static void main(String[] args) {
        boolean valid = true;
        String ssn;
        java.util.Scanner input = new java.util.Scanner(System.in);

        // takes in user input for ssn
        System.out.print("Enter a SSN: ");
        ssn = input.next();

        // checks validity of ssn
        for (int i = 0; i < 11; i++) {
            if (i == 3 || i == 6) {
                if (ssn.charAt(i) != '-')
                    valid = false;
            }
            else {
                if (ssn.charAt(i) < '0' || ssn.charAt(i) > '9')
                    valid = false;
            }
        }

        // just in case the string is longer than 11 characters
        if (ssn.length() != 11)
            valid = false;

        // program output
        if (valid)
            System.out.print(ssn + " is a valid social security number\n");
        else
            System.out.print(ssn + " is not a valid social security number\n");
    }
}
