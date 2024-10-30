package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArList {

	public static void main(String[] args) {
		
		List<Integer> ex = new ArrayList<Integer>();
		List<Integer> ex1 = new ArrayList<Integer>();
		
		ex.add(10);
		ex.add(20);
		ex.add(30);
		ex1.addAll(ex);
		ex.add(100);
		ex1.add(1000);
		
		System.out.println(ex);
		System.out.println(ex1);
		
		//ex1.removeAll(ex);
		//ex1.retainAll(ex);
		
		System.out.println(ex);
		System.out.println(ex1);
		
		Map<Integer, String> ex2= new HashMap<Integer, String>();
		
		ex2.put(1, "12");
		ex2.put(3, "all");
		ex2.put(null, null);
		ex2.put(4, null);
		ex2.put(5, null);
		
		System.out.println("------------");
		System.out.println(ex2);
		


	}

}
