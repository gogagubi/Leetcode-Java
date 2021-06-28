package com.leetcode.example.math;

public class _1837_SumOfDigitsInBaseK {
    public static void main(String[] args) {
        if (true) {
            _1837_SumOfDigitsInBaseK s = new _1837_SumOfDigitsInBaseK();
            int n = 34;
            int k = 6;

            System.out.println(s.sumBase(n, k));
        }

        if (true) {
            _1837_SumOfDigitsInBaseK s = new _1837_SumOfDigitsInBaseK();
            int n = 10;
            int k = 10;

            System.out.println(s.sumBase(n, k));
        }
    }

    public int sumBase(int n, int k) {
        int ans = 0;

        while (n != 0) {
            ans += n % k;
            n /= k;
        }

        return ans;
    }
}
