// SIMPLE UNIVERSITY ENROLLMENT SYSTEM

// Base class representing a person
class Person {
    // Fields
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person's info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass representing a student
class Student extends Person {
    // Fields specific to Student
    private String studentID;
    private String course;
    private int units;
    private final int feePerUnit = 1000; // Final fee per unit

    // Constructor
    public Student(String name, int age, String studentID, String course, int units) {
        super(name, age); // Call to the superclass constructor
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }

    // Method to calculate total fees
    public double calculateFees() {
        return units * feePerUnit; // Total fee calculation
    }

    // Overriding displayInfo to include student details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call to parent method
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + units);
        System.out.println("Total Fee: " + calculateFees());
    }
}

// Subclass representing an instructor
class Instructor extends Person {
    // Fields specific to Instructor
    private String employeeID;
    private String department;
    private double salary;

    // Constructor
    public Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age); // Call to the superclass constructor
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Overriding displayInfo to include instructor details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call to parent method
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Main class to test the system
public class UniversityEnrollmentSystem {

    // Method demonstrating polymorphism
    public static void printDetails(Person p) {
        p.displayInfo(); // Calls the appropriate displayInfo method
        System.out.println(); // For better readability
    }

    public static void main(String[] args) {
        // Creating two Student objects
        Student student1 = new Student("Zyrinne Mae Quiapo", 20, "101438", "Nursing", 12);
        Student student2 = new Student("Monica Kate Gimenez", 20, "271422", "Computer Engineering", 10);

        // Creating two Instructor objects
        Instructor instructor1 = new Instructor("Engr. Tanya Carmela Jovillano", 22, "E001", "CEA", 50000);
        Instructor instructor2 = new Instructor("Engr. Sarahlyn Catimbang", 40, "E002", "CEA", 100000);

        // Printing details using polymorphism
        printDetails(student1);
        printDetails(student2);
        printDetails(instructor1);
        printDetails(instructor2);
    }
}
