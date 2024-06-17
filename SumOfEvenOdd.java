//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
package com.javaconcepts;

import java.util.Scanner;

public class SumOfEvenOdd {

	 public static void main(String args[])
	    {
		 int a[]=new int[6];
	     double evenSum=0, oddSum=0;
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter six numbers:");//taking user input as six number.
	     
	     for(int i=0; i<=5; i++)
	     {
	    	 a[i]=sc.nextInt();
	    	 if(a[i]%2==0)//checking even condition.
	    	 {
	    		 evenSum+=a[i];  
	    	 }
	    	 else if(a[i]%2!=0)//checking odd condition.
	    	 {
	    		 oddSum+=a[i]; 
	    		 
	    	 }
	     }
	     
	     System.out.println("sum of Even number is "+evenSum);
	     
	     System.out.println("sum of Odd number is "+oddSum);
	    }
}
