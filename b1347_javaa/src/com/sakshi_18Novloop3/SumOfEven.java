package com.sakshi_18Novloop3;

public class SumOfEven {
	    public static void main(String[] args) {
	        int sum = 0;

	        for(int i = 101; i <= 151; i++) {
	        	if(i%2 == 0) {
	            sum = sum + i;
	        	}
	        }

	        System.out.println("Sum : " + sum);
	    }
	}

