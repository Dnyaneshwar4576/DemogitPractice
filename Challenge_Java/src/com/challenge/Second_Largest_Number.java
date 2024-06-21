package com.challenge;

public class Second_Largest_Number {

	public static void main(String[] args) {
		int num[] = { 2, 4, 5, 6, 7, 8, 9, 1 };
		int n = num.length;
		int highest = Integer.MIN_VALUE;
		int secondhigest = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (num[i] > highest) {
				secondhigest = highest;
				highest = num[i];
			}
			if (num[i] < highest && num[i] > secondhigest) {
				secondhigest = num[i];
			}
		}
		System.out.println("second higest number is: " + secondhigest);
	}
}
