//Wap to check whether the entered number is prime or not

package com.javaconcepts;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int n, count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");// Taking a user input for check the number is prime or not.
		n=sc.nextInt();
		
		for(int i=2; i<n; i++) {// iterating a loop.
			 if(n%i==0)
	         {
	            count++;
	            break;
	         }
		}
		
		
		if(count==0){//if block is executed when condition is true.
			System.out.println("It is a Prime Number " +n);
		}
		else{// else block is executed when condition is false.
			System.out.println("It is not a Prime Number " +n);
			}
	}
}
