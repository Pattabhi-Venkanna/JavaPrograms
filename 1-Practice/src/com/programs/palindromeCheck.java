package com.programs;

import java.util.Scanner;

public class palindromeCheck {

	public static void main(String[] args) {
		
		System.out.println("enter number to check palindrome or not");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int temp=number;
		int rem,rev=0;
		while(number>0) {
			rem=number%10;
			rev=rev*10+rem;
			number/=10;
		}
		
		String check= temp==rev ? "palindrome" : "not palindrome";
		System.out.println("given number is "+check);
		sc.close();

	}

}
