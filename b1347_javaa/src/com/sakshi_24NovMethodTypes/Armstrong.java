package com.sakshi_24NovMethodTypes;

class CountD {
    public int count(int num) {
        int count = 0; // Local variable resets on every call
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}


class Arm {
    // Helper method to calculate base^exponent
    public int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }
        return result;
    }

    public void armstrongNum(int num) {
        CountD cd = new CountD();
        int l = cd.count(num);
        int original = num; // Save original value before modifying num
        int arm = 0;

        while (num > 0) {
            int n = num % 10;
            arm = arm + power(n, l);
            num /= 10; // Update num, not n
        }

        if (arm == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }
    }
}

public class Armstrong {
    public static void main(String[] args) {
        Arm a = new Arm();
        a.armstrongNum(153);
    }
}