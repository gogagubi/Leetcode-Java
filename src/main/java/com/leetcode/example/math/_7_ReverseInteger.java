package com.leetcode.example.math;

public class _7_ReverseInteger {
    public static void main(String[] args) {
        if (true) {
            _7_ReverseInteger s = new _7_ReverseInteger();
            int x = 123;

            System.out.println(s.reverse(x));
        }

        if (true) {
            _7_ReverseInteger s = new _7_ReverseInteger();
            int x = -123;

            System.out.println(s.reverse(x));
        }

        if (true) {
            _7_ReverseInteger s = new _7_ReverseInteger();
            int x = 120;

            System.out.println(s.reverse(x));
        }

        if (true) {
            _7_ReverseInteger s = new _7_ReverseInteger();
            int x = -12;

            System.out.println(s.reverse(x));
        }
    }

    public int reverse(int x) {
        int reversedInt = 0;
        while (x != 0) {
            if (reversedInt > Integer.MAX_VALUE / 10 || reversedInt < Integer.MIN_VALUE / 10)
                return 0;

            reversedInt = (reversedInt * 10) + (x % 10);
            x /= 10;
        }

        return reversedInt;
    }
}
