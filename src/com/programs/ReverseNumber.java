package com.programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		System.out.println("enter number to revese");
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println("given number is "+number);
		int rev=0;
		int rem;
		while(number>0) {
			rem=number%10;
			rev=(rev*10)+rem;
			number=number/10;
			
		}
		System.out.println("reverse of given number is "+rev);
		
		sc.close();
	}
}
