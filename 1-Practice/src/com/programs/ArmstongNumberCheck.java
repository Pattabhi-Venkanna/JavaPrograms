package com.programs;

import java.util.Scanner;

public class ArmstongNumberCheck {

	public static void main(String[] args) {
		
		System.out.println("enter number to check armstrong or not");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int temp=number;
		int arm=0;
		int rem=0;
		while (number>0) {
			rem=number%10;
			arm=arm+(rem*rem*rem);
			number/=10;
		}
		String check=(arm==temp) ? "armstrong" :"not armstrong";
		System.out.println(check);

	}

}
