//	
//			  A
//			A B	
//		 A  B C	
	package com.sakshi_20NovPatterns;

	public class HPattern18 {
		public static void main(String[] args) {	
			int sp = 5;
			
			for(int r=1;r<=5;r++) {
				for(int s=1;s<=(sp-r);s++) {
				System.out.print(" " + " ");
				}
				char ch ='A';
				for(int c =1;c<=r;c++) {
					System.out.print(ch + " ");
					ch++;
				}
				System.out.println();
			}
		}

	}


