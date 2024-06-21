package com.challenge.assignment;

public class Max_Min_Array {
	public static void main(String[] args) {
		int a[] = {9,4,5,6,7,8};
		int max = a[0];
		for(int i = 1;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println(max+" :is the maximum number in array");
		System.out.println("************************************");
		int min = a[0];
		for(int i = 1;i<a.length;i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println(min+" :is the maximum number in array");
	}
}
