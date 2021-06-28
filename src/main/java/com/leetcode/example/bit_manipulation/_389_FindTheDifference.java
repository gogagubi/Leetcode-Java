package com.leetcode.example.bit_manipulation;


public class _389_FindTheDifference {
    public static void main(String[] args) {
        _389_FindTheDifference c = new _389_FindTheDifference();

        if (true) {
            String s = "abcd";
            String t = "abcde";
            System.out.println("Result " + c.findTheDifference(s, t));
        }

        if (true) {
            String s = "";
            String t = "y";
            System.out.println("Result " + c.findTheDifference(s, t));
        }

        if (true) {
            String s = "a";
            String t = "aa";
            System.out.println("Result " + c.findTheDifference(s, t));
        }

        if (true) {
            String s = "ae";
            String t = "aea";
            System.out.println("Result " + c.findTheDifference(s, t));
        }
    }

    private char findTheDifference(String s, String t) {
        int x = 0;

        for (int i = 0; i < s.length(); i++) x ^= s.charAt(i);
        for (int i = 0; i < t.length(); i++) x ^= t.charAt(i);

        return (char) x;
    }

}
