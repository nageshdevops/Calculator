package com.devops.calculator;

public class Multiply {

	public static void main (String args[])
	{
		Multiply a = new Multiply ();
		System.out.println("Multiply of A * B is = " + a.add(10, 20));
	}
	
	public int add(int a, int b)
	{
		return a * b;
	}
}
