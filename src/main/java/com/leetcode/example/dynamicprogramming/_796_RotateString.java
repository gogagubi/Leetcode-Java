package com.leetcode.example.dynamicprogramming;


public class _796_RotateString {
    public static void main(String[] args) {
        if (true) {
            _796_RotateString c = new _796_RotateString();

            String A = "abcde";
            String B = "cdeab";
            System.out.println("Are rotated " + c.rotateString(A, B));
        }

    }

    public boolean rotateString(String A, String B) {
        int n = A.length();
        int m = B.length();

        if(n != m) return false;
        if(n == 0) return true;

        int[] lps = lps(B);
        A = A + A;
        n = A.length();

        int i = 0, j = 0;
        while (i < n && j < m) {
            if (A.charAt(i) == B.charAt(j)) {
                if (j == m - 1) return true;

                i++;
                j++;
            } else {
                if (j > 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return false;
    }

    private int[] lps(String s) {
        int n = s.length();
        int[] res = new int[n];

        int i = 0, j = 1;
        while (j < n) {
            if (s.charAt(i) == s.charAt(j)) {
                res[j] = i + 1;
                i++;
                j++;
            } else {
                if (i > 0) {
                    i = res[i - 1];
                } else {
                    j++;
                }
            }
        }

        return res;
    }

}
