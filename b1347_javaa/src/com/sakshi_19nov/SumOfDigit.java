package com.sakshi_19nov;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number to get sum of digit : ");
		int n = sc.nextInt();
		
		int sum =0;
		while(n>0) {
			int digit = n%10;
			sum += digit;
			n /= 10;
		}
		System.out.println("Sum : "+sum);
	}

}
