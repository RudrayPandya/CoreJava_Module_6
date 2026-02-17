package com.module1;

class College 
{

    // static variable
    static String collegeName = "GTU";

    // static method
    static void displayCollege() {
        System.out.println("College Name: " + collegeName);
    }

    // non-static method
    void displayStudent(String name) {
        System.out.println("Student Name: " + name);
    }
}
public class Q12_StaticDemo
{
    public static void main(String[] args) 
    {
        // calling static method without object
        College.displayCollege();

        // creating object to call non-static method
        College c1 = new College();
        c1.displayStudent("Rudray");
    }
}
