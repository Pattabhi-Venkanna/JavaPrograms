package com.programs;

public class LettersCount {

	public static void main(String[] args) {
		
		String s ="Welcome Pattabhi 12 Hours Worked!!!";
		int small=0;
		int caps=0;
		int numbers=0;
		int spl=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
				small++;
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				caps++;
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
				numbers++;
			else spl++;
		}
		System.out.println("from the given String");
		System.out.println("small alphabet are "+small);
		System.out.println("capital alphabet are "+caps);
		System.out.println("sapecial alphabet are "+spl);

	}

}
