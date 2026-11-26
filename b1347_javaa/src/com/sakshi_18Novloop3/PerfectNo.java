package com.sakshi_18Novloop3;

import java.util.Scanner;

public class PerfectNo {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a Number :");
		int n = sc.nextInt();
		for(int i =1;i<n;i++) {
			if(n%i == 0) {
				sum += i;
			}
		}
		if(sum == n) {
			System.out.println(n + " : Perfect Number");
		}else {
			System.out.println(n + " : Not a Perfect Number");
		}
	}
}
