package com.challenge.assignment;

import java.util.Arrays;

public class SecondSmallest {
	public static void main(String[] args) {
		int b[] = {2,1,5,4,8,7,9,6,9,4};
		Arrays.parallelSort(b);
		System.out.println("Second smallest number is :"+b[1]);
		System.out.println("********************************");
		int min = Integer.MAX_VALUE;
		int s_min =Integer.MAX_VALUE;
		for(int i=0;i<b.length;i++) {
			if(b[i]<min) {
				s_min = min;
				min = b[i];
			}else if(b[i]<s_min) {
				s_min = b[i];
			}
		}
		System.out.println(s_min+" :is the second smallest number");
	}
}
