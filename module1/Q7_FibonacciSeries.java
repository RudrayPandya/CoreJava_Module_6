package com.module1;

public class Q7_FibonacciSeries 
{
	public static void main(String[] args) 
	{
		int n1 = 0, n2 = 1, n3;
		int count = 20;

		System.out.println("Fibonacci Series up to 20 numbers:");

		System.out.print(n1 + " " + n2);

		for (int i = 3; i <= count; i++) 
			{
				n3 = n1 + n2;
		        System.out.print(" " + n3);
		        n1 = n2;
		        n2 = n3;
		    }
		
	}
}
