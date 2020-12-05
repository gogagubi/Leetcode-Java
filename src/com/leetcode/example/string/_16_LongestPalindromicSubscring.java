package com.leetcode.example.string;

public class _16_LongestPalindromicSubscring {
    public static void main(String[] args) {
        if (true) {
            _16_LongestPalindromicSubscring c = new _16_LongestPalindromicSubscring();

            String s = "babad";
            System.out.println("Longest palindrome " + c.longestPalindrome(s)); //aaacecaaa
        }

        if (true) {
            _16_LongestPalindromicSubscring c = new _16_LongestPalindromicSubscring();

            String s = "cbbd";
            System.out.println("Longest palindrome " + c.longestPalindrome(s)); //aaacecaaa
        }

        if (true) {
            _16_LongestPalindromicSubscring c = new _16_LongestPalindromicSubscring();

            String s = "a";
            System.out.println("Longest palindrome " + c.longestPalindrome(s)); //aaacecaaa
        }

        if (true) {
            _16_LongestPalindromicSubscring c = new _16_LongestPalindromicSubscring();

            String s = "aaa";
            System.out.println("Longest palindrome " + c.longestPalindrome(s)); //aaacecaaa
        }
    }

    public String longestPalindrome(String s) {
        if (s.length() == 0) {
            return s;
        }

        int left = 0, right = 0;
        String result = "";

        while (right < s.length()) {
            while (right + 1 < s.length() && s.charAt(left) == s.charAt(right + 1)) {
                right++;
            }

            if (left == 0) {
                result = s.substring(left, right + 1);
            } else {
                int start = left;
                int end = right;

                while (start > 0 && end < s.length() - 1) {
                    if (s.charAt(start - 1) != s.charAt(end + 1)) {
                        break;
                    }
                    start--;
                    end++;
                }

                if ((end - start + 1) > result.length()) {
                    result = s.substring(start, end + 1);
                }
            }

            right++;
            left = right;
        }

        return result;
    }


}
