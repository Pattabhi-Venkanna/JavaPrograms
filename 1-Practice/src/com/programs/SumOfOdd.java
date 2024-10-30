package com.programs;

import java.util.Scanner;

public class SumOfOdd {
	
	public static void main(String[] args) {
		
		System.out.println("enter number to print sum of odd number from 0 to your number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		System.out.print("odd numbers are ");
		for(int i=0 ; i<=n;i++) {
			if(i%2!=0) {
				System.out.print(i +" ");
				sum=sum+i;
			}
			
		}
		System.out.println(" ");
		System.out.println("sum of odd numbers from 0 to "+n+" is "+sum);
		sc.close();
		
	}

}
