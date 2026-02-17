package com.module1;

public class Q3_Calculator 
{
	public static void main(String[] args) 
	{
		int a = 10,b = 20;
		 // Arithmetic operations
        System.out.println("\n--- Arithmetic Operations ---");
        System.out.println("Addition (+): " + (a + b));
        System.out.println("Subtraction (-): " + (a - b));
        System.out.println("Multiplication (*): " + (a * b));
        System.out.println("Division (/): " + (a / b));
        System.out.println("Modulus (%): " + (a % b));

        // Relational operations
        System.out.println("\n--- Relational Operations ---");
        System.out.println(a + " > " + b + " : " + (a > b));
        System.out.println(a + " < " + b + " : " + (a < b));
        System.out.println(a + " == " + b + " : " + (a == b));
        System.out.println(a + " != " + b + " : " + (a != b));
        System.out.println(a + " >= " + b + " : " + (a >= b));
        System.out.println(a + " <= " + b + " : " + (a <= b));
	}
}
