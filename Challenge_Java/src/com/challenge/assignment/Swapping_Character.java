package com.challenge.assignment;

public class Swapping_Character {
	public static void main(String[] args) {
		String str = "Dnyaneshwar";
		char first = str.charAt(0);
		char last = str.charAt(str.length() - 1);
		String middle = str.substring(1, str.length() - 1);
		String Result = last + middle + first;
		System.out.println(Result);
//	System.out.println(str.charAt(str.length()-1)+str.substring(1,str.length()-1)+str.charAt(0));
//	System.out.println("********************************************");
//	String str1 = "Balaji is a Businessman";
//	String first = str1.substring(0, 7);
//	String middle = str1.substring(8, 12);
//	//String last = str1.substring(14, ));
//	System.out.println(first+middle+first);

	}
}
