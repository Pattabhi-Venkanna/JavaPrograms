package com.programs;

import java.util.Scanner;

public class BiggestOf4Numbers {

	public static void main(String[] args) {
		
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		a=sc.nextInt();
		System.out.println("enter b value");
		b=sc.nextInt();
		System.out.println("enter c value");
		c=sc.nextInt();
		System.out.println("enter d value");
		d=sc.nextInt();
		if(a>b && a>c && a>d)
			System.out.println("a is large number");
		else if(b>a && b>c && b>d)
			System.out.println("b is larg number");
		else if(c>a && c>b && c>d)
			System.out.println("c is large number");
		else
			System.out.println("d is large number");
		

	}

}
