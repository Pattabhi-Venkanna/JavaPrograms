package com.programs;

import java.util.Scanner;

public class SwapNumberwithoutVar {

	public static void main(String[] args) {
		
		System.out.println("enter values for variable a , b");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("numbers are ");
		System.out.println(a);
		System.out.println(b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("after swapping numbers are ");
		System.out.println(a);
		System.out.println(b);
		sc.close();

	}

}
