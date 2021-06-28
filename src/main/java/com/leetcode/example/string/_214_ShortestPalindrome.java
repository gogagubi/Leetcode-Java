package com.leetcode.example.string;

import java.util.Stack;

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

    //This is non standard my-solution
    public String shortestPalindrome(String s) {
        if (s.length() == 0) {
            return s;
        }

        StringBuilder result = new StringBuilder();
        int start = 0, end = 0, inStart, inEnd, reservedStart, reservedEnd, left = 0, right = 0;
        Stack<Character> chars = new Stack<>();

        while (end < s.length()) {
            while (end + 1 < s.length() && s.charAt(start) == s.charAt(end + 1)) {
                end++;
            }

            inStart = start - 1;
            inEnd = end + 1;

            if (inStart < 0) {
                left = inStart;
                right = inEnd;
            }
            else {
                if (inStart <= (s.length() - inEnd - 1)) {
                    reservedStart = inStart;
                    reservedEnd = inEnd;

                    while (inEnd < s.length()) {
                        if (inStart >= 0 && s.charAt(inStart) != s.charAt(inEnd)) {
                            break;
                        }

                        if (inEnd == s.length() - 1) {
                            left = reservedStart;
                            right = reservedEnd;
                        }

                        inStart--;
                        inEnd++;
                    }
                }
            }

            end++;
            start = end;
        }

        while (right > 0 && right < s.length()) {
            if (left < 0) {
                chars.add(s.charAt(right));
            } else {
                left--;
            }

            right++;
        }

        while (!chars.isEmpty()) {
            result.append(chars.pop());
        }

        return result.append(s).toString();
    }


    public String shortestPalindromeWithComments(String s) {
        if (s.length() == 0) {
            return s;
        }

        StringBuilder result = new StringBuilder();
        int start = 0, end = 0, inStart, inEnd, reservedStart, reservedEnd, left = 0, right = 0;
        Stack<Character> chars = new Stack<>();

        //chapter 1
        //calculate two pointers left of center and right of center of palindrome.
        // left might be negative but I take it into account bellow in the chapter 2
        while (end < s.length()) {
            //in the center we can have pair of characters so we move further right until we find different one
            while (end + 1 < s.length() && s.charAt(start) == s.charAt(end + 1)) {
                end++;
            }

            //here we store potential left and right indexes of the center
            inStart = start - 1;
            inEnd = end + 1;

            //if we don't have characters at left that means that we are hold first potential center(left and right)
            if (inStart < 0) {
                left = inStart;
                right = inEnd;
            }
            //otherwise we must check at the left and right of the center if they are match
            else {
                // if we don't have less characters at the right of potential center, than at left
                // it means that characters sequence couldn't be matched and we should skip it.
                // By doing so we avoid extra work
                if (inStart <= (s.length() - inEnd - 1)) {
                    //reserve current potential left and right indexes and try to check if characters sequence
                    // are matched at left and right simultaneously
                    reservedStart = inStart;
                    reservedEnd = inEnd;

                    while (inEnd < s.length()) {
                        if (inStart >= 0 && s.charAt(inStart) != s.charAt(inEnd)) {
                            break;
                        }

                        // at the and of comparision if brake operation don't stop inner loop it means that characters
                        // are equal. So we store next potential left and right
                        if (inEnd == s.length() - 1) {
                            left = reservedStart;
                            right = reservedEnd;
                        }

                        inStart--;
                        inEnd++;
                    }
                }
            }

            end++;
            start = end;
        }

        //chapter 2
        //if right is zero that means we have all same characters in palindrome and we don't need to touch it
        while (right > 0 && right < s.length()) {
            if (left < 0) {
                chars.add(s.charAt(right));
            } else {
                left--;
            }

            right++;
        }

        while (!chars.isEmpty()) {
            result.append(chars.pop());
        }

        return result.append(s).toString();
    }


}
