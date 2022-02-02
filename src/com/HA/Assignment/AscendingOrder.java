package com.HA.Assignment;

import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
	
		int i,j,temp;
		
		Scanner ip = new Scanner(System.in);
		int a[] =new int[3];
		System.out.println("Enter 3 numbers");
		for(i=0;i<3;i++)
		{
			a[i] = ip.nextInt();
		}
		
		for(i=0;i<3;i++) {
			for(j=i+1;j<3;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
				    a[i]=a[j];
				    a[j]=temp;
				}
			}
		}
		System.out.print("Ascending Order is : ");
		for(i=0;i<3;i++)
			System.out.print(a[i]+ " ");

	}

}
