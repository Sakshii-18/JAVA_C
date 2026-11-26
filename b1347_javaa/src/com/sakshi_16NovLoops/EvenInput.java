package com.sakshi_16NovLoops;

import java.util.Scanner;

public class EvenInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("To get even number from given range : ");
		System.out.println("Enter starting number :");
		int s = sc.nextInt();
		
		System.out.println("enter Ending Number : ");
		int e = sc.nextInt();
		
		for(int i =s;i<=e;i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}

}
