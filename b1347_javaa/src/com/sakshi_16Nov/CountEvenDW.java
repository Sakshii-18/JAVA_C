package com.sakshi_16Nov;

public class CountEvenDW {
	public static void main(String[] args) {
		int i = 101;
		int count = 0;
		do {
			if(i%2 == 0) {
				count++;
			}
			i++;
		}while(i<=201);
		System.out.println(count);
	}

}
