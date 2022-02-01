package com.HA.Datatypes;

public class Grades {

	public static void main(String[] args) {

		int marks=105;
		
		if (marks>=90 && marks<=100)
		{
			System.out.println("A Grade with marks " +marks);
		}
		else if (marks>=80 && marks<=89)
		{
			System.out.println("B Grade with marks " +marks);
		}
		else if (marks>=60 && marks<=79)
		{
			System.out.println("C Grade with marks " +marks);
		}
		else if (marks<60)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Invalid input");
		}
	}
}


