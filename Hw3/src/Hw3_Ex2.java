/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           23 Jun 2021
 Assignment:     Homework #03 Exercise #02
 Version:        Java SE 11 (LTS)

 Description: Takes in 10 doubles from
 user input and calculates the mean
 the standard deviation.

 *************************************/


public class Hw3_Ex2 {
    public static void main(String[] args) {
        double array[] = new double[10];
        java.util.Scanner input = new java.util.Scanner(System.in);

        // takes in user input, then outputs result
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++)
            array[i] = input.nextDouble();
        System.out.printf("The mean is %.2f\n", mean(array));
        System.out.printf("The standard deviation is %.2f", deviation(array));
    }

    // calculates the standard deviation of 10 numbers
    public static double deviation(double[] array) {
        double sum = 0;
        double mean = mean(array);
        for (int i = 0; i < 10; i++)
            sum += Math.pow(array[i] - mean, 2);
        return Math.pow(sum / 9.0, 0.5);
    } // end deviation

    // calculates the mean of 10 numbers
    public static double mean(double[] array) {
        double sum = 0;
        for (int i = 0; i < 10; i++)
            sum += array[i];
        return sum / 10.0;
    } // end mean
}