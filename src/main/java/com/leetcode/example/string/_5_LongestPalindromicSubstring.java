package com.leetcode.example.string;

public class _5_LongestPalindromicSubstring {
    public static void main(String[] args) {
        if (true) {
            _5_LongestPalindromicSubstring o = new _5_LongestPalindromicSubstring();
            String s = "babad";

            System.out.println("Result " + o.longestPalindrome(s));
        }

        if (true) {
            _5_LongestPalindromicSubstring o = new _5_LongestPalindromicSubstring();
            String s = "cbbd";

            System.out.println("Result " + o.longestPalindrome(s));
        }

        if (true) {
            _5_LongestPalindromicSubstring o = new _5_LongestPalindromicSubstring();
            String s = "a";

            System.out.println("Result " + o.longestPalindrome(s));
        }

        if (true) {
            _5_LongestPalindromicSubstring o = new _5_LongestPalindromicSubstring();
            String s = "ac";

            System.out.println("Result " + o.longestPalindrome(s));
        }

        if (true) {
            _5_LongestPalindromicSubstring o = new _5_LongestPalindromicSubstring();
            String s = "aacabdkacaa";

            System.out.println("Result " + o.longestPalindrome(s)); //"aca"
        }

        if (true) {
            _5_LongestPalindromicSubstring o = new _5_LongestPalindromicSubstring();
            String s = "bb";

            System.out.println("Result " + o.longestPalindrome(s));
        }

        if (true) {
            _5_LongestPalindromicSubstring o = new _5_LongestPalindromicSubstring();
            String s = "abacdgfdcaba";

            System.out.println("Result " + o.longestPalindrome(s));
        }
    }


    private String longestPalindrome(String s) {
        int n = s.length();
        int l = 0, r = 0;

        for (int i = 0; i < n; i++) {
            int len = Math.max(expandFromMiddle(s, i, i), expandFromMiddle(s, i, i + 1));
            if (len > r - l + 1) {
                l = i - (len - 1) / 2;
                r = i + len / 2;
            }
        }

        return s.substring(l, r + 1);
    }

    private int expandFromMiddle(String s, int l, int r) {
        int n = s.length();
        if (l > r) return 0;

        while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }

        return r - l - 1;
    }

}
