package com.sakshi_19nov;

import java.util.Scanner;

public class HSumOfSqrDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number to get sum of digit : ");
		int n = sc.nextInt();
		
		int sum =0; int sqr = 0;
		while(n>0) {
			int digit = n%10;
			sqr = digit*digit;
			sum += sqr;
			n /= 10;
		}
		System.out.println("Sum : "+sum);
	}

}



