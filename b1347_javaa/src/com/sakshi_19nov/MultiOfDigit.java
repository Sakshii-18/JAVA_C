package com.sakshi_19nov;

import java.util.Scanner;

public class MultiOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number to get sum of digit : ");
		int n = sc.nextInt();
		
		int mul =1;
		while(n>0) {
			int digit = n%10;
			mul *= digit;
			n /= 10;
		}
		System.out.println("Multiplication : "+mul);
	}

}
