package com.programs;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		
		int arr[]= {1,1,2,3,4,4,4,5,5,6,7,8,8};
		int length=arr.length;
		int j=0;
		for(int i=0;i<length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j++]=arr[i];
			}
		}
		arr[j++]=arr[length-1];
		
		int[] out = new int[j];
		
		for(int k=0;k<j;k++) {
			out[k]=arr[k];
		}
		
		for(int a:out) {
			System.out.println(a);
		}

	}

}
