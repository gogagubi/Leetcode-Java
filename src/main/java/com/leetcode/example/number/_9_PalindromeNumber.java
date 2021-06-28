package com.leetcode.example.number;

public class _9_PalindromeNumber {
    public static void main(String[] args) {
        //example 1
        if (true) {
            _9_PalindromeNumber c = new _9_PalindromeNumber();
            int x = 121;
            System.out.println("Is palindrome = " + c.isPalindrome(x));
        }

    }

    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }

        if (x < 0 || x % 10 == 0) {
            return false;
        }

        int reversedInt = 0;
        while (x > reversedInt) {
            int chunk = x % 10;
            x /= 10;

            reversedInt = (reversedInt * 10) + chunk;
        }

        if (x == reversedInt || x == reversedInt / 10) {
            return true;
        }

        return false;
    }

}

