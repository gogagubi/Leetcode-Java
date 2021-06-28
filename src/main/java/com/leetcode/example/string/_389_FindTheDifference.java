package com.leetcode.example.string;


import java.util.HashMap;
import java.util.Map;

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

    public char findTheDifference(String s, String t) {
        int[] ascii = new int[127];
        for (int i = 0; i < s.length(); i++) {
            ascii[s.charAt(i)]++;
        }

        for (int i = 0; i < t.length(); i++) {
            if (ascii[t.charAt(i)] == 0) return t.charAt(i);
            ascii[t.charAt(i)]--;
        }

        return '_';
    }

}
