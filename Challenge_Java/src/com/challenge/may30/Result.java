package com.challenge.may30;

import java.util.Scanner;

public class Result {
	public static void main(String[] args) {
		int a[] = {1,2,6,5,4,7,8,3};
		int first = a[0] , second = a[0];
		for(int i = 1 ; i <a.length;i++) {
			if(a[i]>first) {
				second = first;
				first = a[i];
			}else if(a[i]>second) {
				second = a[i];
			}
		}
		System.out.println("The second largest number is: "+second);
		System.out.println("********************************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = sc.nextInt();
		for(int i =1;i<=num;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("********************************");
		System.out.println("Enter your string");
		String str = sc.next();
		String rev = "";
		int len = str.length();
		for(int i=len-1;i>=0;i--) {
			rev =rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("String is pallindome: "+str);
		}else {
			System.out.println("String is not pallindrome: "+str);
		}
		System.out.println("********************************");
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int count = 0;
		while(n>0) {
			n = n/10;
			count++;
		}
		System.out.println("Total count of number is: "+count);
	}
}
