package com.sakshi_26NovMethodPrac;

import java.util.Scanner;

public class Count_Perfect {

    public boolean isPerfect(int num) {
        int sum = 0;
        for (int i=1; i<num; i++) {
            if (num%i == 0) {
                sum+=i;
            }
        }
        if(sum==num) {
        	return true;
        }else {
        	return false;
        }
    }


    public int countInRange(int start, int end) {
        int count = 0;
        for (int i=start; i<=end;i++) {
            if (isPerfect(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Count_Perfect c = new Count_Perfect();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Is perfect: " + c.isPerfect(num));

        System.out.print("Enter start and end: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println("Count in range: " + c.countInRange(start, end));

        
    }
}