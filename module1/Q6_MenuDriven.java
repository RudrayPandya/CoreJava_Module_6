package com.module1;

import java.util.Scanner;

public class Q6_MenuDriven 
{
	public static void main(String[] args) 
	{
		System.out.println("------ Menu ------");
		System.out.println("1. Pizza");
		System.out.println("2. Pani Puri");
		System.out.println("3. Burger");
		System.out.println("4. Gulab Jamun");
		System.out.println("5. Dal Bati\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Choice : ");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Pizza");
			break;
		
		case 2:
			System.out.println("Pani puri");
			break;
		
		case 3:
			System.out.println("Burger");
			break;
		
		case 4:
			System.out.println("Gulab Jamun");
			break;
		
		case 5:
			System.out.println("Dal Bati");
			break;

		default:
			System.out.println("Choice = 1-5");
			break;
		}
	}
}
