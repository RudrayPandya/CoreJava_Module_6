package com.module1;

//- Create a class Student with attributes (name, age) 
//and a method to display the details

class Student
{
	String name;
	int age;
	
	public void setvalue()
	{
		name = "Rudray";
		age = 19;
	}
	
	public void display()
	{
		System.out.println("Student name = "+name);
		System.out.println("Student age = "+age);
	}
}

public class Q8_StudentClass 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.setvalue();
		s1.display();
	}
}
