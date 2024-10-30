package com.programs;

import java.util.Scanner;

public class Stringpalindrome {

	public static void main(String[] args) {
		
		String original,reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter word to check palindrome or not");
		original=sc.next();
		System.out.println(original);
		for(int i =original.length();i<original.length();i--)
			reverse=reverse+original.charAt(i);
		String res=(original.equals(reverse)) ? "Palindrome" : "Not Palindrome";
		
		System.out.println("Given word is "+res);

	}

}
