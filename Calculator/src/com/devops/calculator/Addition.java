package com.devops.calculator;

public class Addition {

	public static void main (String args[])
	{
		//This is for addition
		Addition a = new Addition ();
		System.out.println("Addition of A + B is = " + a.add(10, 20));
	}
	
	public int add(int a, int b)
	{
		return a + b;
	}
}
