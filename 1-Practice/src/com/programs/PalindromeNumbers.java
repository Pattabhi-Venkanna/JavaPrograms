package com.programs;

import java.util.Scanner;

public class PalindromeNumbers {

	public static void main(String[] args) {
		
		System.out.println("enter number to print palindrome numbers");
		Scanner sc=new Scanner(System.in);
		int terms = sc.nextInt();
		System.out.println("we will print palindrome numbers from 0 to "+terms);
		for(int i=1;i<=terms;i++) {
			//System.out.println(i);
			int rem=0;
			int rev=0;
			int temp=i;
			while(temp>0) {
				rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;
			}
			if(i==rev)
				System.out.println(rev);
			
		}

	}

}
