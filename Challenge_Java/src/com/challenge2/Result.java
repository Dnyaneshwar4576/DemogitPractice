package com.challenge2;

public class Result {
	String name;
	int age;
	public static void main(String[] args) {
		Result res = new Result();
		res.name = "Dnyaneshwar";
		res.age = 27;
		System.out.println("My age is: "+res.age);
		System.out.println(res.name);
	}
}
