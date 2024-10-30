package com.basic;

import java.util.Scanner;

public class EvenOddCheck {

	public static void main(String[] args) {
		int num ;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to check even or odd");
		num=sc.nextInt();
		if (num%2==0) {
			System.out.println("given number is even");
		} else {
			System.out.println("given number is odd");

		}
		//using ternary operator
		
	String oup=(num%2==0)? "enterd number is even":"entered number is odd";
		System.out.println(oup);

	}

}
