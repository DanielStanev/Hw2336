/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           19 Jul 2021
 Assignment:     Homework #04 Exercise #08
 Version:        Java SE 11 (LTS)

 Description: Person class for exercise
 8.

 *************************************/

public class Person {
    // Data Fields
    String name, address, phone, email;

    // Constructors
    Person() {}
    Person(String name) {
        this.name = name;
    }

    // toString Method works for all subclasses
    public String toString() {
        return "Class: " + getClass().getName() + " Name: " + name;
    }
}
class Student extends Person {
    // Data Fields
    private final String classStatus;

    // Constructors
    Student(String name, String classStatus) {
        this.name = name;
        this.classStatus = classStatus;
    }
    Student(String classStatus) {
        this.classStatus = classStatus;
    }
}

class Employee extends Person {
    // Data Fields
    double salary;
    String office;
    MyDate dateHired = new MyDate();

    // Constructors
    Employee() { }
    Employee(String name) {
        this.name = name;
    }
}

class Staff extends Employee {
    // Data Fields
    String title;

    // Constructors
    Staff() {}
    Staff(String name) {
        this.name = name;
    }
}

class Faculty extends Employee {
    // Data Fields
    String hours, rank;

    // Constructors
    Faculty() {}
    Faculty(String name) {
        this.name = name;
    }
}
