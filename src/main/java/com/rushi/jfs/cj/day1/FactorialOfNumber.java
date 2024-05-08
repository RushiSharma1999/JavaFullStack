package com.rushi.jfs.cj.day1;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int num = 5;
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        System.out.println("Factorial of " + num + " is " + result);
    }
}
