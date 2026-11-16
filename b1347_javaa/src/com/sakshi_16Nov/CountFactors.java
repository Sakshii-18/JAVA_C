package com.sakshi_16Nov;

import java.util.Scanner;

public class CountFactors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number to count factors : ");
		int num = sc.nextInt();
		int count = 0;
		
		for(int i =1;i<=num;i++) {
			if(num%i == 0) {
				count++;
			}
		}
		System.out.println("Total Factors of "+num+" are " +count);
	}

}
