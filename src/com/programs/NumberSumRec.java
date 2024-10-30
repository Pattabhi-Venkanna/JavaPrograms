package com.programs;

import java.util.Scanner;

public class NumberSumRec {
	
	int sum=0;

	public static void main(String[] args) {
		System.out.println("enter number to get sum");
		Scanner sc=new Scanner(System.in);
		int no =sc.nextInt();
		NumberSumRec noSum=new NumberSumRec();		
		System.out.println("Sum is "+noSum.getnumberSum(no));
	}
	
	public int getnumberSum(int n) {
		int rem;
		while(n>0) {
			rem=n%10;
			sum=sum+rem;
			n/=10;
		}
		return sum;
	}

}
