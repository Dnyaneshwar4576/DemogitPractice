package com.wrapper;

public class Swapping_Number {

	public static void main(String[] args) {
		int a = 30, b= 20;
		System.out.println("Before Swapping two number: "+a+ " "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping two number: "+a+ " "+b);
	}

}
