package com.sakshi_15Nov;

import java.util.Scanner;

public class Book {
	public static void main(String[] args) {
		String name;String author;double price;int qty;double total;
		double discount;double finaltotal;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Name of Book : ");
		name = sc.next();
		
		System.out.println("Enter Author Name : ");
		author = sc.next();
		
		System.out.println("Enter Price :");
		price = sc.nextDouble();
		
		System.out.println("Enter qty :");
		qty = sc.nextInt();
		
		total = price * qty;
		
		if (total >=2000) {
			discount = (total * 15) /100;
			
		}
		else if(total >= 1000) {
			discount = (total*10)/100;
		}
		else if(total>=500) {
			discount = (total*5)/100;
		}
		else {
			discount = 0;
		}
		finaltotal = total - discount;
		System.out.println("-----Bill-----");
		System.out.println("Total : " +total);
		System.out.println("Discount : " +discount);
		System.out.println("Final Total : " +finaltotal);
		
		
	}
	

}
