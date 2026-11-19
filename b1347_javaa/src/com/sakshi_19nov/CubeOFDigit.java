package com.sakshi_19nov;

import java.util.Scanner;

public class CubeOFDigit {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		
		while(a>0) {
			int num=a%10;
			System.out.print(" "+num*num);
			a=a/10;
			}
		}

	}



