package com.sakshi_24NovMethodTypes;

class PowerOfNum1 {
	int result = 1;
	public int powerNum(int base,int p) {
		for(int i=1;i<=p;i++) {
			 result = result*base;
		
		}
		return result;
	}

}

public class PowerOfNum{
	public static void main(String[] args) {
		PowerOfNum1 p = new PowerOfNum1();
		int result = p.powerNum(2, 3);
		System.out.println(result);
	}
}
