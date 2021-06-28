package com.leetcode.example.dynamicprogramming;


public class _459_RepeatedSubstringPattern {
    public static void main(String[] args) {
        if (false) {
            _459_RepeatedSubstringPattern c = new _459_RepeatedSubstringPattern();

            String s = "abab";
            System.out.println(c.repeatedSubstringPattern(s));
        }

        if (false) {
            _459_RepeatedSubstringPattern c = new _459_RepeatedSubstringPattern();

            String s = "aba";
            System.out.println(c.repeatedSubstringPattern(s));
        }

        if (true) {
            _459_RepeatedSubstringPattern c = new _459_RepeatedSubstringPattern();

            String s = "abcabcabcabc";
            System.out.println(c.repeatedSubstringPattern(s));
        }

        if (false) {
            _459_RepeatedSubstringPattern c = new _459_RepeatedSubstringPattern();

            String s = "bb";
            System.out.println(c.repeatedSubstringPattern(s));
        }
    }

    public boolean repeatedSubstringPattern(String s) {
        boolean ans = false;
        int n = s.length();
        if (n <= 1) return ans;

        int[] lps = new int[n];

        int i = 0, j = 1;
        while (j < n) {
            if (s.charAt(i) == s.charAt(j)) {
                lps[j] = i + 1;

                i++;
                j++;
            } else {
                if (i > 0) {
                    i = lps[i - 1];
                } else {
                    j++;
                }
            }
        }

        if (lps[lps.length - 1] == 0) return ans;
        int patternLength = s.length() - lps[lps.length - 1];

        if (s.length() % patternLength == 0) ans = true;
        return ans;
    }


}
