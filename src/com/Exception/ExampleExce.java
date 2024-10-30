package com.Exception;

import java.io.IOException;

public class ExampleExce {

	public static void main(String[] args) throws Exception {
		info();
		
	}
	public static void info() throws Exception {
		System.out.println("hello");
		throw new Exception();
		}

}
