package com.sakshi_24NovMethodTypes;

class PrimeLogic{
	public int prime(int num) {
		int count = 0;
		for(int i =2;i<num;i++) {
			if(num%i ==0) {
				count++;
			}
		}
		return count;
	}
}


public class Prime {
	public static void main(String[] args) {
		PrimeLogic p = new PrimeLogic();
		int num = 4;
		int res = p.prime(num);
		
		if(res == 0) {
			System.out.println("prime");
		}
		else {
			System.out.println("Not prime");
		}
	}

}
