package com.sakshi_18Nov;

import java.util.Scanner;
import java.lang.Math;

public class POFNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Power of Number");
		System.out.println("enter base : ");
		double b = sc.nextInt();
		
		System.out.println("Enter power : ");
		double p = sc.nextInt();
		
		double result = 0;
		result = Math.pow(b, p);
		System.out.println(result);
	}

}
