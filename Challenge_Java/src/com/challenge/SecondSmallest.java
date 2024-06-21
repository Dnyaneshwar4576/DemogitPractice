package com.challenge;

public class SecondSmallest {

	public static void main(String[] args) {
		int num[] = { 2, 4, 5, 6, 7, 8, 9, 1 };
		int n = num.length;
		int smallest = Integer.MAX_VALUE;
		int secondsmallest = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (num[i] < smallest) {
				secondsmallest = smallest;
				smallest = num[i];
			}
			if (num[i] > smallest && num[i] < secondsmallest) {
				secondsmallest = num[i];
			}
		}
		System.out.println("second higest number is: " + secondsmallest);

	}

}
