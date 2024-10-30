package com.programs;

import java.util.HashMap;

public class CountWordInString {

	public static void main(String[] args) {
		
		String str="my name is is name pattabhi"; //just checking
		String str2[]=str.split(" ");
		System.out.println(str2.length);
		HashMap<String, Integer> vals=new HashMap<String, Integer>();
		vals.put("jhg", 2);
		
		for(String s:str2) {
			if(vals.containsKey(s)) {
				int x=vals.get(s);
				vals.put(s, x+1);
			}
			else
				vals.put(s, 1);
		}
		System.out.println(vals);

	}

}
