package com.sakshi_20NovPatterns;

public class Pattern8 {
	public static void main(String[] args) {
		int k =5;
		for(int r=1;r<=5;r++) {
			for(int c=1;c>=5;c++) {
				if(r==c || k==c) {
				System.out.print("$"+ " ");
				}
				else {
				System.out.print("*"+" ");
				}
	
				
			}
			k--;
			System.out.println();
			
		}
	}

}
