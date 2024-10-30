package com.programs;

import java.util.Scanner;

public class palindromeCount {

	public static void main(String[] args) {
		
		System.out.println("enter number to count palindrome numbers");
		Scanner sc=new Scanner(System.in);
		int terms=sc.nextInt();
		System.out.println("we will count palindrome numbers from 0 to "+terms);
		int count=0;
		for(int i=1;i<=terms;i++) {
			int temp=i;
			int rev=0;
			int rem=0;
			while(temp>0) {
				rem=temp%10;
				rev=rev*10+rem;
				temp/=10;
			}
			if(rev==i){
				count++;
				System.out.println(rev);
			}
		}
		System.out.println("palindrome numbers 0 to "+terms+" are "+count);

	}

}
