package com.programs;

import java.util.Scanner;

public class ArmstrongNumPrint {

	public static void main(String[] args) {

		System.out.println("enter number to print armstrong numbers");
		Scanner sc=new Scanner(System.in);
		int terms=sc.nextInt();
		System.out.println("we will print armstrong numbers from 0 to "+terms);
		int count=0;
		for(int i=1;i<=terms;i++) {
			
			int temp=i;
			int arm=0;
			int rem=0;
			
			while(temp>0) {
				rem=temp%10;
				arm=arm+rem*rem*rem;
				temp/=10;
			}
			if(arm==i) {
				System.out.println(i);
				count++;
			}
			
		}
		System.out.println("armstrong numbers from 0 to "+terms+" are "+count);
		sc.close();

	}

}
