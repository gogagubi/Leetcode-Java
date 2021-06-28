package com.leetcode.example.dynamicprogramming;

public class _214_ShortestPalindrome {
    public static void main(String[] args) {
        if (true) {
            _214_ShortestPalindrome c = new _214_ShortestPalindrome();

            String s = "aacecaaa";
            System.out.println("Shortest palindrome " + c.shortestPalindrome(s)); //aaacecaaa
        }

        if (true) {
            _214_ShortestPalindrome c = new _214_ShortestPalindrome();

            String s = "abcd";
            System.out.println("Shortest palindrome " + c.shortestPalindrome(s)); //dcbabcd
        }

        if (true) {
            _214_ShortestPalindrome c = new _214_ShortestPalindrome();

            String s = "cdcba";
            System.out.println("Shortest palindrome " + c.shortestPalindrome(s)); //abcdcba
        }

        if (true) {
            _214_ShortestPalindrome c = new _214_ShortestPalindrome();

            String s = "abbacd";
            System.out.println("Shortest palindrome " + c.shortestPalindrome(s)); //dcabbacd
        }

        if (true) {
            _214_ShortestPalindrome c = new _214_ShortestPalindrome();

            String s = "a";
            System.out.println("Shortest palindrome " + c.shortestPalindrome(s)); //a
        }

        if (true) {
            _214_ShortestPalindrome c = new _214_ShortestPalindrome();

            String s = "aaaaa";
            System.out.println("Shortest palindrome " + c.shortestPalindrome(s)); //aaaaa
        }

        if (true) {
            _214_ShortestPalindrome c = new _214_ShortestPalindrome();

            String s = "aabba";
            System.out.println("Shortest palindrome " + c.shortestPalindrome(s)); //abbaabba
        }
    }

    //This is kmp solution
    private String shortestPalindrome(String s) {
        int n = s.length();
        if (n == 0) return "";

        int[] lps = calculateLps(new StringBuilder(s).append("#").append(new StringBuilder(s).reverse()).toString());
        return new StringBuilder(s.substring(lps[lps.length - 1])).reverse().append(s).toString();
    }


    private int[] calculateLps(String s) {
        int n = s.length();
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

        return lps;
    }


}
