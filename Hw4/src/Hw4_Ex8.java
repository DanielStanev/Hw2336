/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           8 Jul 2021
 Assignment:     Homework #04 Exercise #19
 Version:        Java SE 11 (LTS)

 Description: Test program for person 
 class and subclasses.

 *************************************/
public class Hw4_Ex8 {
    public static void main(String[] x) {
        Person p1 = new Person("Didko");
        Person p2 = new Student("Niki", "Sophomore");
        Person p3 = new Employee("Gabe");
        Person p4 = new Faculty("Carmen");
        Person p5 = new Staff("Eric");

        // output testing toString() method
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
    }
}
