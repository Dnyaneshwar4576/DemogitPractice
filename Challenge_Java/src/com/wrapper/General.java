package com.wrapper;

import java.util.Scanner;

public class General {
	public static void main(String[] args) {
		Scanner sc  = new Scanner (System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		String str = String.valueOf(num);
		System.out.println(str);
		int len  = str.length();
		System.out.println(len);
	}
}
