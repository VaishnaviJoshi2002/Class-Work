//WAP a program to reverse a given String without using reverse() method.

package com.string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		//Taking user input.
		System.out.println("Enter a String:");
		s1=sc.nextLine();
		s2="";
		
		for(int i=0;i<s1.length();i++)
		{
			//converting original string to the reverse.
			s2=s1.charAt(i)+s2;
		}
		
		//printing original and reverse string values.
		System.out.println("Original String is: "+s1);
		System.out.println("Reverse String is: "+s2);
	}

}
