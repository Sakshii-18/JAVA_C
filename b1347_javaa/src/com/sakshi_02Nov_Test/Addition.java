package com.sakshi_02Nov_Test;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		System.out.println("Addition of Two Num ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number :");
		int n1 = sc.nextInt();
		
		System.out.println("Enter 2nd Number :");
		int n2 = sc.nextInt();
		
		System.out.println("Addition of "+n1+" & " +n2+ " = " +(n1+n2));
	}
}
