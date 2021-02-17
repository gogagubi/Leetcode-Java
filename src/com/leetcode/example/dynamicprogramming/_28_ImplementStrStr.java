package com.leetcode.example.dynamicprogramming;


public class _28_ImplementStrStr {
    public static void main(String[] args) {
        if (true) {
            _28_ImplementStrStr c = new _28_ImplementStrStr();

            String haystack = "hello";
            String needle = "ll";
            System.out.println("First occurence = " + c.strStr(haystack, needle));
        }

        if (true) {
            _28_ImplementStrStr c = new _28_ImplementStrStr();

            String haystack = "aaaaa";
            String needle = "bba";
            System.out.println("First occurence = " + c.strStr(haystack, needle));
        }

        if (true) {
            _28_ImplementStrStr c = new _28_ImplementStrStr();

            String haystack = "";
            String needle = "a";
            System.out.println("First occurence = " + c.strStr(haystack, needle));
        }

        if (true) {
            _28_ImplementStrStr c = new _28_ImplementStrStr();

            String haystack = "aaa";
            String needle = "aaaa";
            System.out.println("First occurence = " + c.strStr(haystack, needle));
        }

        if (true) {
            _28_ImplementStrStr c = new _28_ImplementStrStr();

            String haystack = "mississippi";
            String needle = "issip";
            System.out.println("First occurence = " + c.strStr(haystack, needle));
        }

        if (true) {
            _28_ImplementStrStr c = new _28_ImplementStrStr();

            String haystack = "mississippi";
            String needle = "issipi";
            System.out.println("First occurence = " + c.strStr(haystack, needle));
        }

        if (true) {
            _28_ImplementStrStr c = new _28_ImplementStrStr();

            String haystack = "a";
            String needle = "a";
            System.out.println("First occurence = " + c.strStr(haystack, needle));
        }

        if (true) {
            _28_ImplementStrStr c = new _28_ImplementStrStr();

            String haystack = "";
            String needle = "";
            System.out.println("First occurence = " + c.strStr(haystack, needle));
        }
    }

    //Using Kmp algorithm
    private int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;

        int ans = -1;
        int n = haystack.length();
        int m = needle.length();
        if (m > n) return ans;

        int[] lps = calculateLPS(needle);

        int i = 0, j = 0;
        while (i < n && j < m) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                if (j == m - 1) {
                    ans = i + 1 - m;
                    break;
                }

                i++;
                j++;
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return ans;
    }

    private int[] calculateLPS(String pattern) {
        int n = pattern.length();

        int[] lps = new int[n];

        int i = 0, j = 1;
        while (j < n) {
            if (pattern.charAt(i) == pattern.charAt(j)) {
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
