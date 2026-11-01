package com.sakshi_30Oct;

import java.util.Scanner;

public class InputCls {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = sc.nextInt();
		System.out.println("Integer : "+n);

		System.out.println("Enter any byte number : ");
		byte b = sc.nextByte();
		System.out.println("Byte : "+b);
		
		System.out.println("Enter any long number : ");
		long l = sc.nextLong();
		System.out.println("Long : "+l);
		
		System.out.println("Enter any short number : ");
		short s = sc.nextShort();
		System.out.println("Short : "+s);
		
		System.out.println("Enter any float number : ");
		float f = sc.nextFloat();
		System.out.println("Float : "+f);
		
		System.out.println("Enter any Double number : ");
		double d = sc.nextDouble();
		System.out.println("Double : "+d);
		
		System.out.println("Enter String : ");
		 String s1 = sc.next();
		System.out.println("String : "+s);
		
		System.out.println("Enter any true/false : ");
		boolean bo = sc.nextBoolean();
		System.out.println(" Boolean: "+bo);
		
	}

}
