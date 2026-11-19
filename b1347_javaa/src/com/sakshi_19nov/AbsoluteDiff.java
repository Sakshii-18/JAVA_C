package com.sakshi_19nov;

import java.util.Scanner;

public class AbsoluteDiff {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any num to reverse : ");
		int n = sc.nextInt();
		int ono = n;
		
		int rev = 0;
		while(n>0) {
			int digit = n%10;
			rev = (rev*10) + digit;
			n /= 10;
			
		}
		int absolute_diff = rev - ono;
		
		if(absolute_diff <=0 ) {
			absolute_diff = -absolute_diff;
		}
		System.out.println("Absolute Difference of "+rev+ " - " +ono+ " = " +absolute_diff);
		}
	}

