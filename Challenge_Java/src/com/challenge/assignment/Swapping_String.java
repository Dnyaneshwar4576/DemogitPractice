package com.challenge.assignment;

public class Swapping_String {
	public static void main(String[] args) {
		String str = "Obejct Oriented Programming Language";
		int first = str.indexOf(" ");
		String firstword = str.substring(0, first);
		System.out.println(firstword);
		String lastword = str.substring(str.lastIndexOf(" ")+1);
		System.out.println(lastword);
	}
}
