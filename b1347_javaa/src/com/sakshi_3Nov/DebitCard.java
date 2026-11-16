package com.sakshi_3Nov;

import java.util.Scanner;

public class DebitCard {
	public static void main(String[] args) {
		System.out.println("Enter Your Debit Card Details :");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Amount :");
		double amt = sc.nextDouble();
		
		System.out.println("Enter Cardholder Name :");
		String name = sc.next();
		
		System.out.println("Enter Card Number :");
		long cno = sc.nextLong();
		
		System.out.println("Enter Expiry Date :");
		String date = sc.next();
		
		System.out.println("Enter CVV Number :");
		int cvv = sc.nextInt();
		
		System.out.println("Enter OTP :");
		long otp = sc.nextLong();
		
		System.out.println("Enter Amount :" +amt);
		System.out.println("Enter Cardholder Name :" +name);
		System.out.println("Enter Card Number :"+cno);
		System.out.println("Enter Expiry Date :"+date);
		System.out.println("Enter CVV Number :"+cvv);
		System.out.println("Enter OTP :"+otp);
	}

}
