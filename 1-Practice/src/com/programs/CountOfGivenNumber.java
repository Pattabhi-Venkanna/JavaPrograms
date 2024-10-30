package com.programs;

import java.util.Scanner;

public class CountOfGivenNumber {

	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		number=sc.nextInt();
		int digit=0;
		while(number>0) {
			number/=10;
			digit++;
		}
		System.out.println("digits for enterd number are "+digit);

	}

}
