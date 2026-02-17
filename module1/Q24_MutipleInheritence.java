package com.module1;

class Demo implements Printable, Showable {

    // Implementing Printable interface method
    public void print() {
        System.out.println("Printing data...");
    }

    // Implementing Showable interface method
    public void show() {
        System.out.println("Showing data...");
    }
}
public class Q24_MutipleInheritence 
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();

        d.print();
        d.show();
	}
}
