package com.sakshi_19nov;

import java.util.Scanner;

public class Palindrome {
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
		if(ono == rev) {
		System.out.println(rev +" is a Palindrome!!");
		}else {
			System.out.println(rev +" is Not a Palindrome!!");
		}
	}

}
