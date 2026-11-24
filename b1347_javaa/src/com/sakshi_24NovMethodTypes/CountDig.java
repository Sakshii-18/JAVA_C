package com.sakshi_24NovMethodTypes;

class CountDig1 {
	int count =0;
	public int count(int num) {
	while(num>0) {
		int digit = num%10;
		count++;
		num /=10;
	}
	return count;
	}

}

public class CountDig {
	public static void main(String[] args) {
		CountDig1 a = new CountDig1();
		int res = a.count(12234);
		System.out.println(res);
	}

}
