package com.sakshi_15Nov;

import java.util.Scanner;

public class Fruit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		
		if (num%3==0 && num%5 == 0) {
			System.out.println("Mango and Apple");
			
		}else if(num%5 == 0) {
			System.out.println("Apple");
		}
		else if(num%3==0) {
			System.out.println("Mango");
			
		}
		else {
			System.out.println(num);
		}
	}

}
