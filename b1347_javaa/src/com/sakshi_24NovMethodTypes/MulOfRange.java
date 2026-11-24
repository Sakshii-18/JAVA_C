package com.sakshi_24NovMethodTypes;

import java.util.Scanner;

public class MulOfRange {
	public int Mul(int a, int b) {
		int result = 1;
		for (int i = a; i <= b; i++) {
			result *= i;

		}
		return result;
	}

}



class MulOfRangeM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range start : ");
		int a = sc.nextInt();

		System.out.println("Enter range End : ");
		int b = sc.nextInt();

		MulOfRange m = new MulOfRange();
		int ans = m.Mul(1, 5);

		System.out.println("Multiplication Of range " + ans);

	}
}

