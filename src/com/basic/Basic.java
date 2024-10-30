package com.basic;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		a=sc.nextInt();
		System.out.println(a);
		if(a%2==0) {
			System.out.println("given number is even");
		}
		else {
			System.out.println("given number is odd");
		}
		sc.close();

	}

}
