package com.sakshi_19nov;

import java.util.Scanner;

public class HSpecialNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number to check if its special or not : ");
		int n = sc.nextInt();
		int temp = n;
	
		int sum =0,mul=1;
		while(n>0) {
			int digit = n%10;
			sum += digit;
			mul *= digit;
			n /= 10;
		}
		
		if(sum == mul) {
			System.out.println(temp+ " is a Special Number");
		}
		else {
			System.out.println(temp+ " is not a Special Number");
		}
	}

}
