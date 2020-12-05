package com.leetcode.example.math;

public class _263_UglyNumber {
    public static void main(String[] args) {
        if (true) {
            _263_UglyNumber c = new _263_UglyNumber();
            int num = 6;

            System.out.println("Result " + c.isUgly(num));
        }

        if (true) {
            _263_UglyNumber c = new _263_UglyNumber();
            int num = 8;

            System.out.println("Result " + c.isUgly(num));
        }

        if (true) {
            _263_UglyNumber c = new _263_UglyNumber();
            int num = 14;

            System.out.println("Result " + c.isUgly(num));
        }
    }

    public boolean isUgly(int num) {
        if (num <= 0) return false;
        while (num % 2 == 0) num /= 2;
        while (num % 3 == 0) num /= 3;
        while (num % 5 == 0) num /= 5;
        return num == 1;
    }
}
