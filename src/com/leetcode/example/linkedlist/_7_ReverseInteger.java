package com.leetcode.example.linkedlist;

public class _7_ReverseInteger {
    public static void main(String[] args) {
        //example 1
        if (true) {
            _7_ReverseInteger c = new _7_ReverseInteger();
            int x = 123;
            System.out.println("reversed int = " + c.reverse(x));
        }

        if (true) {
            _7_ReverseInteger c = new _7_ReverseInteger();
            int x = -123;
            System.out.println("reversed int = " + c.reverse(x));
        }

        if (true) {
            _7_ReverseInteger c = new _7_ReverseInteger();
            int x = 120;
            System.out.println("reversed int = " + c.reverse(x));
        }

        if (true) {
            _7_ReverseInteger c = new _7_ReverseInteger();
            int x = 1534236469;
            System.out.println("reversed int = " + c.reverse(x));
        }
    }

    public int reverse(int x) {
        int reversedInt = 0, chunk;

        while (x != 0) {
            chunk = x % 10;
            x /= 10;

            if (reversedInt > Integer.MAX_VALUE / 10 || reversedInt < Integer.MIN_VALUE / 10) {
                return 0;
            }

            reversedInt = (reversedInt * 10) + chunk;
        }

        return reversedInt;
    }

}

