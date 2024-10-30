package com.programs;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		System.out.println("enter number to generate multiplication table");
		
		Scanner sc =new Scanner(System.in);
		int number=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			int res=number*i;
			System.out.println(number + " X "+i+" = " +res);
		}

	}

}
