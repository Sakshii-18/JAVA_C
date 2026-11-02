package com.sakshi_02Nov_Test;

import java.util.Scanner;

public class Shapes {
	public static void main(String[] args) {
		System.out.println("Areas of shapes");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius :");
		int r = sc.nextInt();
		System.out.println("Area of Circle : " +(3.14*(r*r)));
		
		System.out.println("Enter length :");
		int l = sc.nextInt();
		System.out.println("Enter breadth :");
		int b = sc.nextInt();
		System.out.println("Area of Rectangle : " +(l*b));
		
		System.out.println("Enter side of square :");
		int s = sc.nextInt();
		System.out.println("Area of Square : " +(s*s));
		
		System.out.println("Enter base :");
		int base = sc.nextInt();
		System.out.println("Enter height :");
		int h = sc.nextInt();
		System.out.println("Area of Right angled Triangle : " +(0.5*base*h));
		
		System.out.println("Enter base :");
		int b1 = sc.nextInt();
		System.out.println("Enter height :");
		int h1 = sc.nextInt();
		System.out.println("Area of Parallelogram : " +(base*h));
		
		
		System.out.println("Enter radius :");
		int cr = sc.nextInt();
		System.out.println("Circumference of Circle : " +(2*3.14*cr));
		
		System.out.println("Enter any number to get square and cube :");
		int num = sc.nextInt();
		System.out.println("Square : " +(num*num));
		System.out.println("Cube : " +(num*num*num));
		
		
		
	}

}
