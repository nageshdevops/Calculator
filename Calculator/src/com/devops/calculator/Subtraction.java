
package com.devops.calculator;

public class Subtraction {

	public static void main (String args[])
	{
		Subtraction a = new Subtraction ();
		System.out.println("Subtraction of A - B is = " + a.add(100, 20));
	}
	
	public int add(int a, int b)
	{
		return a - b;
	}
}
