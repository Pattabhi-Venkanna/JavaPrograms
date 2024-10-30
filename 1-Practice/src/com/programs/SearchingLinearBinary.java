package com.programs;

public class SearchingLinearBinary {

	public static void main(String[] args) {
		
		int nums[]= {5,7,9,11,13};
		int target=11;
		
//		int result=linearSearch(nums,target);
		int result=binarySearch(nums,target);
		if(result!=-1) {
			System.out.println("target is found "+result);
		}
		else System.out.println("element not found");
	}
	public static int binarySearch(int[] nums, int target) {
		
		int left=0;
		int right=nums.length-1;
		
		while(left<=right) {
			int mid=(left+right)/2;
			
			if(target==nums[mid])
				return mid;
			else if(target>nums[mid])
				left=mid+1;
			else
				right= mid-1;
		}
		return -1;
	}

	public static int linearSearch(int[] nums, int target) {
		
		for(int i=0;i<nums.length;i++) {
			if(target==nums[i]) {
				return i;
			}
		}
		
		return -1;
	}

}
