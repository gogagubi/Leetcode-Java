package com.leetcode.example.math;

public class _172_FactorialTrailingZeroes {
    public static void main(String[] args) {
        if (true) {
            _172_FactorialTrailingZeroes c = new _172_FactorialTrailingZeroes();
            int n = 3;

            System.out.println("Result " + c.trailingZeroes(n));
        }

        if (true) {
            _172_FactorialTrailingZeroes c = new _172_FactorialTrailingZeroes();
            int n = 5;

            System.out.println("Result " + c.trailingZeroes(n));
        }

        if (true) {
            _172_FactorialTrailingZeroes c = new _172_FactorialTrailingZeroes();
            int n = 0;

            System.out.println("Result " + c.trailingZeroes(n));
        }
    }

    public int trailingZeroes(int n) {
        int numberOfFives = 0;

        while(n > 0){
            n /= 5;
            numberOfFives += n;
        }

        return numberOfFives;
    }
}
