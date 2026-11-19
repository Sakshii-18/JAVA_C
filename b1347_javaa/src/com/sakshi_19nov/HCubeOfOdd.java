package com.sakshi_19nov;

import java.util.Scanner;

public class HCubeOfOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any number : ");
		int n = sc.nextInt();
		
		
		while(n>0) {
			int digit = n%10;
			if(digit%2 != 0) {
				int cube = digit*digit*digit;
				System.out.print(" "+cube);
			}
			n /=10;
			
		}
		
		
	}

}
