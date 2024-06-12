//Write a java program to capitalize each word in string.
package com.string;

import java.util.Scanner;

public class CapitalizeString {

	public static void main(String[] args) {
		
		String s1, s2;
		Scanner sc=new Scanner(System.in);
		//Taking User Input.
		System.out.println("Enter a String:");
		s1=sc.nextLine();
		
		// Capitalize each word in String using toUpperCase() Method.
		s2=s1.toUpperCase();
		
		//Printing the String
		System.out.println("Original String is: " +s1);
		System.out.println("Capitalize String is: " +s2);
	}
		

}
