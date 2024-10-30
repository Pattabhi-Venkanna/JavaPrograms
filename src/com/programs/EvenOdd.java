package com.programs;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		System.out.println("enter number to find given number is even odd");
		Scanner sc=new Scanner(System.in);
		int number = sc.nextInt();
		String s=(number%2==0) ? "even number": "odd number";
		System.out.println("given number is "+s);
		sc.close();

	}

}
