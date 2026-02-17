package com.module1;

public class Q4_TypeCasting 
{
	public static void main(String[] args) 
	{
		int i1 = 100;   // 4 byte
        long l1;        // 8 byte

        l1 = i1;  // implicit
        System.out.println("Implicit is.. " + l1);

        int a1;   // 4 byte
        a1 = (int) l1;  // explicit
        System.out.println("Explicit is.. " + a1);

        int c1 = 128;   // 4 byte
        byte b1;        // 1 byte
        b1 = (byte) c1; // explicit
        System.out.println("Explicit byte is.. " + b1);
	}
}
