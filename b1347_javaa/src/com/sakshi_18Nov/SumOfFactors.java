package com.sakshi_18Nov;

import java.util.Scanner;

public class SumOfFactors {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a Number :");
		int n = sc.nextInt();
		for(int i =1;i<=n;i++) {
			if(n%i == 0) {
				sum += i;
				
			}
		}
		System.out.println("sum of factors : " +sum);
	}
}
