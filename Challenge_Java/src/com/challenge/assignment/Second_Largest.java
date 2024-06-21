package com.challenge.assignment;

public class Second_Largest {
	public static void main(String[] args) {
		int a[] = { 4, 5, 7, 8, 9, 12 };
		int first = a[0], second = a[0];
		for(int i =1;i<a.length;i++) {
			if(a[i]>first) {
				second = first;
				first = a[i];
			}else if(a[i]>second) {
				second = a[i];
			}
		}
		System.out.println(second+" :is the second largest number");
		System.out.println("*************************************");
		int first1 = a[0], second1 = a[0];
		for(int i =1;i<a.length;i++) {
			if(a[i]<first1) {
				second1 = first1;
				first1 = a[i];
			}else if(a[i]<second1) {
				second1 = a[i]+1;
			}
		}
		System.out.println(second1+" :is the second largest number");
	}
}
