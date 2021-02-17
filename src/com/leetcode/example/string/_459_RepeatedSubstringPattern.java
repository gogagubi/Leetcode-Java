package com.leetcode.example.string;


public class _459_RepeatedSubstringPattern {
    public static void main(String[] args) {
        if (true) {
            _459_RepeatedSubstringPattern c = new _459_RepeatedSubstringPattern();

            String s = "abab";
            System.out.println(c.repeatedSubstringPattern(s));
        }

        if (true) {
            _459_RepeatedSubstringPattern c = new _459_RepeatedSubstringPattern();

            String s = "aba";
            System.out.println(c.repeatedSubstringPattern(s));
        }

        if (true) {
            _459_RepeatedSubstringPattern c = new _459_RepeatedSubstringPattern();

            String s = "abcabcabcabc";
            System.out.println(c.repeatedSubstringPattern(s));
        }

        if (true) {
            _459_RepeatedSubstringPattern c = new _459_RepeatedSubstringPattern();

            String s = "bb";
            System.out.println(c.repeatedSubstringPattern(s));
        }

        if (true) {
            _459_RepeatedSubstringPattern c = new _459_RepeatedSubstringPattern();

            String s = "giogio";
            System.out.println(c.repeatedSubstringPattern(s));
        }
    }

    public boolean repeatedSubstringPattern(String s) {
        return s.concat(s).substring(1, 2 * s.length() - 1).contains(s);
    }

}
