package com.sakshi_17Nov;

import java.util.Scanner;

public class Prog2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any range of Numbers :");
		System.out.println("Enter starting number :");
		int s = sc.nextInt();
		
		System.out.println("Enter Ending Number :");
		int e = sc.nextInt();
		
		for(int i = s;i<=e;i++) {
			if(i%4 == 0 && i%7 ==0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
