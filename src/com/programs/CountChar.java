package com.programs;

import java.util.HashMap;
import java.util.Map;

public class CountChar {

	public static void main(String[] args) {
		
		String str="Pattabhi";
		char ch[] =str.toCharArray();
		
		Map<Character, Integer> chars = new HashMap<Character, Integer>();
		
		for(char c:ch) {
			if(chars.containsKey(c)) {
				int x=chars.get(c);
				chars.put(c, x+1);
			}
			else {
				chars.put(c, 1);
			}
		}
			System.out.println(chars);

	}

}
