package com.sakshi_26NovMethodPrac;

import java.util.Scanner;

public class Factorial {
	public int factorial(int num) {
		int fact =1;
		for(int i=1;i<=num;i++) {
			fact = fact*i;
			
		}
		return fact;
		
	}
	
public static void main(String[] args) {
	Factorial f = new Factorial();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num = sc.nextInt();
	
	int res = f.factorial(num);
	System.out.println("Factorial : " +res);
}
		

}
