package com.basic;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks to check grade");
		marks=sc.nextInt();
		if(marks >=90 && marks<100) {
			System.out.println("A+ Grade");
		}
		else if (marks >=80 && marks<90) {
			System.out.println("A Grade");
		}
		else if (marks >=70 && marks<80) {
			System.out.println("B Grade");
		}else if (marks >=60 && marks<70) {
			System.out.println("C Grade");
		}
		else if (marks >=50 && marks<60) {
			System.out.println("D Grade");
		}
		else {
			System.out.println("default Marks");
		}
	}

}
