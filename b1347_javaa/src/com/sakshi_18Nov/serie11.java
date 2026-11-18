package com.sakshi_18Nov;

public class serie11 {
		public static void main(String[] args) {
			char a = 'A';
			for(int i =1;i<=10;i++) {
				if(i%2 != 0) {
					System.out.print(" "+ (char)(a+32));
					a++;
				}else {
				System.out.print(" "+ a);
				}
			}
		}
	}


