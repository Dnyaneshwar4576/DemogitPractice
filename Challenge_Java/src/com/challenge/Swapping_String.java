package com.challenge;

public class Swapping_String {

	public static void main(String[] args) {
		String str ="Dnyaneshwar Dashrath Saravde";
		System.out.println(str);
		int len = str.length();
		String str1 =str.substring(0, 12);
		System.out.println(str1);
		String str2 =str.substring(12, 21);
		System.out.println(str2);
		String str3 =str.substring(21, 28);
		System.out.println(str3);
		String result = str3 + str2 + str1;
		System.out.println(result);
	}

}
