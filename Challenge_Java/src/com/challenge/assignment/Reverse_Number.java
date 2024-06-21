package com.challenge.assignment;

import java.util.Scanner;

public class Reverse_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int rev = 0;
		for (; num > 0;num = num / 10) {
			rev = rev * 10 + num % 10;
		}
		System.out.println(rev+" :is the reverse number");
	}
}
