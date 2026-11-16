package com.sakshi_3Nov;
import java.util.Scanner;

public class Books {
	   public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.println("Enter Book Name:");
	       String book_name = sc.nextLine();

	       System.out.println("Enter Book Price:");
	       double book_price = sc.nextDouble();

	       System.out.println("Enter Book Quantity:");
	       int book_quantity = sc.nextInt();
	       
	       double book_total = book_price * book_quantity;
	       double discount = (book_total * 10) /100;
	       double final_amt = book_total - discount;
	       
	        System.out.println("Details");
	        System.out.println("Book Name: " + book_name);
	        System.out.println("Book Price: " + book_price);
	        System.out.println("Book Quantity: " + book_quantity);
	        System.out.println("Book Total: " + book_total);
	        System.out.println("Discount : " +discount);
	        System.out.println("final amt : " +final_amt);
	    }
		
	
        
    

  
    	
    }

    
