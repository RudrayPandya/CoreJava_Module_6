package com.module1;

class Employee
{
	private int id;
    private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
}


public class Q10_Encapsulation 
{
	public static void main(String[] args) {
        Employee s = new Employee();

        s.setId(101);
        s.setName("Rudray");

        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
    }
}
