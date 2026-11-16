package com.sakshi_3Nov;

import java.util.Scanner;

public class Netflix {

	  public static void main(String[] args) {

	      Scanner sc = new Scanner(System.in);

	      System.out.println("Enter Customer Name : ");
	      String customer_name = sc.nextLine();

	      System.out.println("Enter Customer Phone : ");
	      String customer_phone = sc.nextLine();

	      System.out.println("Enter Customer Email ID : ");
	      String customer_email_id = sc.nextLine();

	      System.out.println("Enter Subscription Amount : ");
	      double sub_amount = sc.nextDouble();

	      System.out.println("Customer Name : " + customer_name);
	      System.out.println("Customer Phone : " + customer_phone);
	      System.out.println("Customer Email ID : " + customer_email_id);
	      System.out.println("Subscription Amount : " + sub_amount);

	       
	    
	}

}
