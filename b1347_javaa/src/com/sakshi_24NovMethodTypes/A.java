
package com.sakshi_24NovMethodTypes;

public class A {

    // Checks if a single number is prime
    public boolean checkPrimeNumber(int y) {
        int count = 0;
        for (int k = 1; k <= y; k++) {
            if (y % k == 0)
                count++;
        }
        if (count == 2)
            return true;
        else
            return false;
    }

    // Prints all prime numbers between a and b
    public void printPrimeNumber(int a, int b) {
        for (int k = a; k <= b; k++) {
            if (checkPrimeNumber(k) == true)
                System.out.println(k);
        }
    }

    public static void main(String[] args) {
        A obj = new A();

        // Print all prime numbers in a range
        System.out.println("Prime numbers from 1 to 20:");
        obj.printPrimeNumber(1, 100);
    }
}