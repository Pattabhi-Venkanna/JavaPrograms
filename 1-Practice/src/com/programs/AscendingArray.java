package com.programs;

import java.util.Scanner;

public class AscendingArray {

	public static void main(String[] args) {
		
		System.out.println("enter array length");
		Scanner sc = new Scanner(System.in);
		int len=sc.nextInt();
		int temp;
		int arr[] = new int[len];
		System.out.println("enter array elements");
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<len;i++) {
			
			for(int j=i+1;j<len;j++) {
				
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		System.out.println("ascending order");
		for(int i=0;i<len;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("descending order");
		int a=len-1;
		for(int i=a;i<len;i--) {
			System.out.println(arr[i]);
		}
		

	}

}
