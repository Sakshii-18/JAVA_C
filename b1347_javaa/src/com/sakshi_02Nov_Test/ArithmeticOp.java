package com.sakshi_02Nov_Test;

import java.util.Scanner;

public class ArithmeticOp {
	public static void main(String[] args) {
		System.out.println("Arithmetic Operationss");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Num :");
		int n1 = sc.nextInt();
		
		System.out.println("Enter 2nd num : ");
		int n2 = sc.nextInt();
		
		System.out.println("Addition : " +(n1+n2));
		System.out.println("Subtraction : " +(n1-n2));
		System.out.println("Multiplication : " +(n1*n2));
		System.out.println("Division : " +(n1/n2));
		System.out.println("Mod : " +(n1%n2));
		
	}

}
