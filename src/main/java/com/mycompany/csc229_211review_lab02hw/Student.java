package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab, Jared Tobias
 */

// Used extends to make Student a child of Person
public class Student extends Person {

    // added GPA and address fields
    private double GPA;
    private String address;

    // constructor
    public Student(String name, short age, double GPA) {
        // super to get fields from Person class
        super(name, age);
        this.GPA = GPA;
    }

    // Getters and setters for GPA
    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    // added getAddress() and setAddress() to fix errors
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // toString method
    @Override
    public String toString() {
        return "Student {" +
                "Name=" + getName() +
                "Age=" + getAge() +
                "GPA=" + GPA +
                '}';
    }

}