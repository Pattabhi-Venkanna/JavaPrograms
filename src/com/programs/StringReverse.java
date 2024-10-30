package com.programs;

public class StringReverse {

	public static void main(String[] args) {
		
		StringBuilder sc=new StringBuilder("Welcome");
		System.out.println(sc.reverse());
		
		String str="welcome";
		String rev="";
		
		for(int i =str.length()-1;i>=0;i--)
			rev=rev+str.charAt(i);

		System.out.println("reverse string:- "+rev);

	}

}
