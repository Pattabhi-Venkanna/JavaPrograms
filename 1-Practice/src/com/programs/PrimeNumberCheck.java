package com.programs;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		
		System.out.println("enter number to check prime or not");
		Scanner sc= new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("enterd number is "+number);
		int count=0;
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime");
		}else System.out.println("not prime");

	}

}
