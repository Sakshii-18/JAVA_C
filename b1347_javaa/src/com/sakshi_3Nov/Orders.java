package com.sakshi_3Nov;

import java.util.Scanner;

public class Orders {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ordered by : ");
		String name = sc.next();
		
		System.out.println("Ordered Item : ");
		String item = sc.next();
		
		System.out.println("Quantity : ");
		int qty = sc.nextInt();
		
		System.out.println("Order price : ");
		double price = sc.nextDouble();
		
		double total = price * qty;
		double sgst = (total * 2.5) /100;
		double cgst = (total * 2.5) /100;
		double parcel = 100;
		double netTotal = total + sgst + cgst + parcel;
		
		System.out.println();
		System.out.println("Ordered By : " +name);
		System.out.println("Ordered Item : " +item);
		System.out.println("Quantity : " +qty);
		System.out.println("price : " +price);
		System.out.println("total : " +total);
		System.out.println("SGST : "+sgst);
		System.out.println("CGST : "+cgst);
		System.out.println("Parcel Charges : "+parcel);
		System.out.println("net total :" + netTotal);
		
		
		
		
	}

}
