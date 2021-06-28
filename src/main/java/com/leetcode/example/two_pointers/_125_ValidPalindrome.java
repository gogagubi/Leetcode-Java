package com.leetcode.example.two_pointers;

public class _125_ValidPalindrome {
    public static void main(String[] args) {
        if (true) {
            _125_ValidPalindrome c = new _125_ValidPalindrome();

            String s = "A man, a plan, a canal: Panama";
            System.out.println("Valid palindrome " + c.isPalindrome(s));
        }

        if (true) {
            _125_ValidPalindrome c = new _125_ValidPalindrome();

            String s = "race a ca";
            System.out.println("Valid palindrome " + c.isPalindrome(s));
        }

        if (true) {
            _125_ValidPalindrome c = new _125_ValidPalindrome();

            String s = "0P";
            System.out.println("Valid palindrome " + c.isPalindrome(s));
        }

        if (true) {
            _125_ValidPalindrome c = new _125_ValidPalindrome();

            String s = ".,";
            System.out.println("Valid palindrome " + c.isPalindrome(s));
        }

        if (true) {
            _125_ValidPalindrome c = new _125_ValidPalindrome();

            String s = " ";
            System.out.println("Valid palindrome " + c.isPalindrome(s));
        }
    }

    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < s.length() - 1 && !isAlphanumeric(s.charAt(left))) {
                left++;
            }
            while (right > 0 && !isAlphanumeric(s.charAt(right))) {
                right--;
            }

            if (left < right
                    && Character.toLowerCase(s.charAt(left++)) != Character.toLowerCase(s.charAt(right--))) {
                return false;
            }
        }

        return true;
    }

    public boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

}
