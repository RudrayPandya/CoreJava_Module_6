package com.module1;

//Write a program to create and initialize an object using a parameterized constructor.

class Student2 {
    int id;
    String name;

    // Parameterized constructor
    Student2(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class Q16_ParameteizedConstructor 
{
	public static void main(String[] args) 
	{
		Student2 s1 = new Student2(101, "Rudray");
        // Displaying object data
        s1.display();
	}
}
