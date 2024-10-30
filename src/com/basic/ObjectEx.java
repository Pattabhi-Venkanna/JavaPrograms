package com.basic;
class Studet{
	int id;
	String name;
	public Studet(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}

public class ObjectEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Studet s1=new Studet(23, "Karna");
System.out.println(s1.id);
System.out.println(s1.name);
	}

}
