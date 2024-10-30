package com.programs;

import java.util.Scanner;

public class VowlsConsonentsCount {
	
	public static void main(String[] args) {
		
		String word="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter word");
		word=sc.next();
		int vowels=0;
		int consonents=0;
		int len=word.length();
		for(int i=0;i<len;i++) {
			char ch=word.charAt(i);
			if(ch=='a'|| ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='O' || ch=='o' || ch=='u' || ch=='U') {
				vowels++;
			}
			else
				consonents++;
		}
		System.out.println("vowels are "+vowels);
		System.out.println("consonents are "+consonents);
		

	}

}
