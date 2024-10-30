package com.basic;

import java.util.Scanner;

public class SwitchMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int month;
//		String monthStr="";
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter number to Check month");
//		month=sc.nextInt();
//		switch (month) {
//		case 1: monthStr="1-January";
//			
//			break;
//		case 2: monthStr="2-Feb";
//		
//		break;
//		case 3: monthStr="3-March";
//		
//		break;
//		case 4: monthStr="4-Apr";
//		
//		break;
//		case 5: monthStr="5-May";
//
//		break;
//		case 6: monthStr="6-june";
//
//		break;
//		case 7: monthStr="7-July";
//
//		break;
//		case 8: monthStr="8-Aug";
//
//		break;
//		case 9: monthStr="9-Sep";
//		
//		break;
//		case 10: monthStr="10-Oct";
//
//		break;
//		case 11: monthStr="11-Nov";
//
//		break;
//		case 12: monthStr="12-Dec";
//
//		break;
//		default: monthStr="enter month between 1-12";
//			break;
//		}
//		System.out.println(monthStr);
		
		char ch='U';
		switch (ch) {
		case 'a' & 'A':System.out.println("vowel");
			
			break;
		case 'e' & 'E':System.out.println("vowel");
		
		break;
		case 'i' & 'I':System.out.println("vowel");
		
		break;
		case 'o' & 'O':System.out.println("vowel");
	
		break;
		case 'u' & 'U':System.out.println("vowel");
		
		break;

		default:System.out.println("consonant");
			break;
		}

	}

}
