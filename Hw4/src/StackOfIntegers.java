/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           8 Jul 2021
 Assignment:     Homework #04 Exercise #05
 Version:        Java SE 11 (LTS)

 Description: StackOfIntegers Class for
 exercise 5.

 *************************************/

public class StackOfIntegers {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    // Constructors
    StackOfIntegers() {}
    StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    // utility methods
    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        elements[size++] = value;
    }
    public int pop() {
        return elements[--size];
    }
    public int getSize() {
        return size;
    }
}