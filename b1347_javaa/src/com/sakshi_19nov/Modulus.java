package com.sakshi_19nov;

import java.util.Scanner;

public class Modulus {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number12344");
		int a=sc.nextInt();
		int n=0;
		while(a>0) {
			System.out.println("a -: "+a);
			n=a%10;
			System.out.println("N -: "+n);
			a=a/10;
		}
	}

}
