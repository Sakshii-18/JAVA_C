package com.sakshi_18Nov;

import java.util.Scanner;

public class PONum2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Power of Number");
		System.out.println("enter base : ");
		int b = sc.nextInt();
		
		System.out.println("Enter power : ");
		int p = sc.nextInt();
		
		int result = 1;
		
		for(int i =1;i<=p;i++) {
			result = result * b;
		}
		System.out.println("Result = " +result);
		
	}

}
