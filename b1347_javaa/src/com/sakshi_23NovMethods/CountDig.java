package com.sakshi_23NovMethods;

public class CountDig {
	int count =0;
	public void count(int num) {
	while(num>0) {
		int digit = num%10;
		count++;
		num /=10;
	}
	System.out.println(count);
	}

}
