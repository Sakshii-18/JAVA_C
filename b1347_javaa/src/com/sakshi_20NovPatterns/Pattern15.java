package com.sakshi_20NovPatterns;

public class Pattern15 {
	public static void main(String[] args) {
		for(int r=5;r>=1;r--) {
			char ch ='A';
			for(int c=1;c<=r;c++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}

}
