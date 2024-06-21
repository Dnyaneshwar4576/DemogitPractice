package com.challenge.assignment;

import java.util.Scanner;

public class Reverse_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String name = sc.next();
		String org_name = name;
		String rev = "";
		int len = name.length();
		for(int i =len-1;i>=0;i-- ) {
			rev = rev + name.charAt(i);
		}
		if(org_name.equalsIgnoreCase(rev)) {
			System.out.println("Given String is pallindrome: "+org_name);
		}else {
			System.out.println("Given String is not pallindrome: "+org_name);
		}
	}
}
