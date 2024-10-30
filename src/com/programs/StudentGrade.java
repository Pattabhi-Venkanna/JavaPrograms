package com.programs;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		int marks;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student marks to know grades");
		marks=sc.nextInt();
		if(marks<=100 && marks>=90)
			System.out.println("A+ Grade");
		else if(marks<=89 && marks>=80)
			System.out.println("A Grade");
		else if(marks<=79 && marks>=70)
			System.out.println("B Grade");
		else if(marks<=69 && marks>=60)
			System.out.println("C Grade");
		else if(marks<=59 && marks>=50)
			System.out.println("D Grade");
		else if(marks<=49 )
			System.out.println("Fail in exam");
	}

}
