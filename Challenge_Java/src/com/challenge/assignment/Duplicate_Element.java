package com.challenge.assignment;

public class Duplicate_Element {
	public static void main(String[] args) {
		int a[] = {3,5,3,5,7,8,9,9};
		for(int i = 0; i<a.length;i++) {
			for(int j =i+1;j<a.length;j++) {
				if(a[i]==a[j]);
				System.out.println(a[i]+" :Duplicate element");
			}
			
		}
	}
}
