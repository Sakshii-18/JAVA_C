package com.sakshi_23NovMethods;

public class NumberTask {
	public void SumOfRange(int num) {
		int sum =0;
		while (num > 0) {
			int digit = num % 10;
			sum +=digit;
			num /=10;
		}
		System.out.println("Sum Of Range : "+sum);
	}

}
