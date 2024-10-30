package com.programs;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {

		System.out.println("enter number to print even numbers and sum of even numbers from 0 to your number");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		System.out.println("even numbers are ");
		for(int i =0; i<=n;i++) {
			if(i%2==0) {
				System.out.print(i+ " ");
				sum=sum+i;
			}
		}
		System.out.println(" ");
		System.out.println("sum of even number from 0 to"+n+ " is "+sum);
		sc.close();

	}

}
