package com.basic;

import java.util.Scanner;

public class PositveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int check;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number to check +ve or -ve");
		check = sc.nextInt();
		if (check>0) {
			System.out.println("enter number is +ve");
		} else if (check<0) {
			System.out.println("enter number is -ve");

		} else {
			System.out.println("enter number is zero");

		}

	}

}
