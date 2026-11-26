package com.sakshi_16NovLoops;

public class CountEven {
	public static void main(String[] args) {
		int count = 0;
		for(int i =101; i<=201;i++) {
			if(i%2 == 0) {
				count++;
			}
		}
		System.out.println("Total even num from 101 to 201 : " +count);
	}

}
