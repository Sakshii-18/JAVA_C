package com.sakshi_18Nov;

import java.util.Scanner;

public class SumMultiplyInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter start : ");
		int s = sc.nextInt();
		
		System.out.println("Ener End :");
		int e = sc.nextInt();
		
		int sum = 0, mul = 1;
		for(int i =s;i<=e;i++) {
			sum = sum + i;
			mul = mul * i;
		}
		
		System.out.println("Sum : " +sum+ " Multiplication : " +mul);
		
	}

}
