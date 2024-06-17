package com.javaconcepts;

import java.util.Scanner;

public class MarksDetails extends Student {
	//Derived Class

	public void getValue()
	{
		int[] arr=new int[5];
		int i;
		double res=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Five subject Marks:");//Taking user input.
		for(i=0; i<=4; i++) {
			
			arr[i]=sc.nextInt();
			res+=arr[i]/5;
		}
		
		System.out.println("Your result is " +res+ "%");
	}
	
	public static void main(String[] args) {
		
		MarksDetails obj1=new MarksDetails();
		//Method Calling.
		obj1.inputData();
		obj1.getValue();
		obj1.displayData();
	}

}
