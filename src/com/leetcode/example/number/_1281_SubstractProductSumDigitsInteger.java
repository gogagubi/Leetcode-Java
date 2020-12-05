package com.leetcode.example.number;

public class _1281_SubstractProductSumDigitsInteger {
    public static void main(String[] args) {
        if (true) {
            _1281_SubstractProductSumDigitsInteger c = new _1281_SubstractProductSumDigitsInteger();
            int n = 234;
            System.out.println("result = " + c.subtractProductAndSum(n));
        }

        if (true) {
            _1281_SubstractProductSumDigitsInteger c = new _1281_SubstractProductSumDigitsInteger();
            int n = 4421;
            System.out.println("result = " + c.subtractProductAndSum(n));
        }
    }

    public int subtractProductAndSum(int n) {
        int multiply = 1;
        int sum = 0;

        while (n != 0) {
            int reminder = n % 10;

            multiply *= reminder;
            sum += reminder;

            n = n / 10;
        }

        return multiply - sum;
    }

}

