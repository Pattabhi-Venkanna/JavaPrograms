package com.programs;

import java.util.Scanner;

public class SumOfGivenNumber {

	public static void main(String[] args) {
		
		System.out.println("enter number to get sum");
		int number = new Scanner(System.in).nextInt();
		System.out.println(number);
		int sum=0,rem=0;
		while(number>0) {
			rem=number%10;
			sum=sum+rem;
			number/=10;
		}
		System.out.println("sum of individual digits are "+sum);

	}

}
