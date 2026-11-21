package com.sakshi_20NovPatterns;

public class Pattern7 {
	public static void main(String[] args) {
		
		for(int r=5;r>=1;r--) {
			for(int c=1;c<=5;c++) {
				if(r==c) {
				System.out.print("$"+ " ");
				}
				else {
					System.out.print("*"+" ");
				}
				
				
			}
		
			System.out.println();
			
		}
	}

}
