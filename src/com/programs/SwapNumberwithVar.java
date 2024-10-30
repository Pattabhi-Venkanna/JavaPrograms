package com.programs;

import java.util.Scanner;

public class SwapNumberwithVar {

	public static void main(String[] args) {
		
		System.out.println("enter values for a , b variables");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b = sc.nextInt();
		System.out.println("before swap a value is "+a);
		System.out.println("before swap b value is "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("after swap a value is "+a);
		System.out.println("after swap b value is "+b);
		sc.close();

	}

}
