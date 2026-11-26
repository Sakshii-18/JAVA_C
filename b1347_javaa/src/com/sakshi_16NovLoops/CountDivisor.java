package com.sakshi_16NovLoops;

import java.util.Scanner;

public class CountDivisor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give a Range of Numbers : ");
		System.out.println("Starting Number : ");
		int s = sc.nextInt();
		
		System.out.println("Ending Number : ");
		int e = sc.nextInt();
		
		int count = 0;
		
		for(int i =s;i<=e;i++) {
			if(i%4 == 0 && i%7 ==0) {
				count++;
			}
		}
		System.out.println("Total Numbers Divisible by 4 and 7 are : " +count);
	}
}
