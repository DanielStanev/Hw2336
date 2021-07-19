/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           9 Jul 2021
 Assignment:     Homework #04 Exercise #05
 Version:        Java SE 11 (LTS)

 Description: Test program for stack 
 of integers class.

 *************************************/

public class Hw4_Ex5 {
    public static void main(String[] x) {
        StackOfIntegers stack = new StackOfIntegers(60);

        // generates stack and the prints to console
        for (int n = 1; n <= 120; n++)
            if (isPrime(n))
                stack.push(n);
        while (stack.getSize() != 0)
            System.out.println(stack.pop());
    }

    // checks if a number
    public static Boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
