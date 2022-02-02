package com.HA.Assignment;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {

		int i,n,res=0;
		
		Scanner Odd = new Scanner(System.in);
		System.out.println("Enter a number");
		n = Odd.nextInt();
		
		for(i=1;i<=n;i++) {
			if(i%2!=0)
				res = res + i;
		}
		System.out.println("The sum of odd numbers from 1 to " +n+ " = " +res);
	}

}
