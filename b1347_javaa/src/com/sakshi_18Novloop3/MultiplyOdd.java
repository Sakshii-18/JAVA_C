package com.sakshi_18Novloop3;

public class MultiplyOdd {
	public static void main(String[] args) {
        int multiply = 1;

        for(int i = 701; i >= 501; i--) {
        	if(i%2 != 0) {
            multiply = multiply * i;
        	}
        }

        System.out.println("Multiplication : " + multiply);
    }
}
