package com.programs;

import java.util.Scanner;

public class CountOfEven {

	public static void main(String[] args) {

		System.out.println("enter number to count odd number from 0 to your number");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				count++;
			}
		}
		System.out.println("even numbers from 0 to "+n+" is "+count);
		sc.close();
	}

}
