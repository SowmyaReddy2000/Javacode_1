package com.HA.Datatypes;

public class Loops {

	public static void main(String[] args) {
		
	int[] numbers = {10,65,87,65,25,33,49,58,79,66};
		int size = numbers.length;
		System.out.println(size);
	
		for(int i=0;i<=size;i++)
		{
			if(numbers[i] <= 50)
			System.out.println(numbers[i]);
		}

	}

}
