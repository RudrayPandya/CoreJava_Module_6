package com.module1;

class Person 
{
    void showPerson() 
    {
        System.out.println("I am a Person");
    }
}

// Derived class (Level 1)
class Student1 extends Person 
{
    void showStudent() 
    {
        System.out.println("I am a Student");
    }
}

// Derived class (Level 2)
class EngineeringStudent extends Student1 
{
    void showEngineeringStudent() 
    {
        System.out.println("I am an Engineering Student");
    }
}

public class Q14_MultiLevel 
{
	public static void main(String[] args) 
	{
		EngineeringStudent obj = new EngineeringStudent();

        // Accessing methods of all levels
        obj.showPerson();
        obj.showStudent();
        obj.showEngineeringStudent();
	}
}

