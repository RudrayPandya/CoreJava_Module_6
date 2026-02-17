package com.module1;

class Parent
{
	public void parent_money()
	{
		System.out.println("Parent Money = 50000/-");
	}
}

class Child extends Parent
{
	public void child_money()
	{
		System.out.println("Child money = 10000/-");
	}
}

public class Q13_Single_Inheritance 
{
	public static void main(String[] args) 
	{
		Child c1 = new Child();
		c1.child_money();
		c1.parent_money();
	}
}
