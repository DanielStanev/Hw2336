public class Person {
    String name, address, phone, email;

    Person() {}
    Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return "Class: " + getClass().getName() + "\nName: " + name;
    }
}
class Student extends Person {
    private final String classStatus;

    Student(String name, String address, String phone, String email, String classStatus) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.classStatus = classStatus;
    }
    Student(String classStatus) {
        this.classStatus = classStatus;
    }
}

class Employee extends Person {
    String office;
    int date;

}

class Staff extends Employee {

}

class Faculty extends Employee {

}
