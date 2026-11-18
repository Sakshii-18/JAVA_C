package com.sakshi_18Nov;

public class MultiplyNumbers {
    public static void main(String[] args) {
        int multiply = 1;

        for(int i = 1; i <= 10; i++) {
            multiply = multiply * i;
        }

        System.out.println("Multiplication : " + multiply);
    }
}