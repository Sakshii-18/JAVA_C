package com.sakshi_20NovPatterns;

public class Pattern17{
	public static void main(String[] args) {	
		int sp = 5;
		for(int i=1;i<=5;i++) {
			for(int s=1;s<=(sp-i);s++) {
			System.out.print(" ");
			}
			for(int j =1;j<=i;j++) {
				
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

}

