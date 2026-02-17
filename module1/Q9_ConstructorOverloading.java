package com.module1;

//Create multiple constructors in a class and demonstrate constructor overloading.

class ConstructDemo
{
	int sum;
	int no1 = 10,no2 = 20;
	
	public void ConstructDemo() 
	{
		
		sum = no1+no2;
		System.out.println("Sum of two number (Constructor 1): "+sum);
	}
	
	public void ConstructDemo(int no1,int no2)
	{
		this.no1=no1;
		this.no2=no2;
		sum = no1+no2;
		System.out.println("Sum of two number (Constructor 2): "+sum);
	}

}

public class Q9_ConstructorOverloading 
{
	public static void main(String[] args) 
	{
		ConstructDemo c1 = new ConstructDemo();
		c1.ConstructDemo();
		c1.ConstructDemo(10,20);
	}
}
