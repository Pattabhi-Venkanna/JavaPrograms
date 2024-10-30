package com.programs;

public class SecoundMinimumNumber {

	public static void main(String[] args) {
		
		int arr[]= {12,43,-22,87,-43,55};
		int temp;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		
		System.out.println("second min number is "+arr[1]);

	}

}
