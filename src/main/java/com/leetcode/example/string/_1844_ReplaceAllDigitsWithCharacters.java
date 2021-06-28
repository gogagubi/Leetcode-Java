package com.leetcode.example.string;

public class _1844_ReplaceAllDigitsWithCharacters {
    public static void main(String[] args) {
        if (true) {
            _1844_ReplaceAllDigitsWithCharacters o = new _1844_ReplaceAllDigitsWithCharacters();
            String s = "a1c1e1";

            System.out.println("Result " + o.replaceDigits(s));
        }

        if (true) {
            _1844_ReplaceAllDigitsWithCharacters o = new _1844_ReplaceAllDigitsWithCharacters();
            String s = "a1b2c3d4e";

            System.out.println("Result " + o.replaceDigits(s));
        }
    }


    public String replaceDigits(String s) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                ans.append(s.charAt(i));
            } else {
                ans.append((char) (s.charAt(i - 1) + (s.charAt(i) - '0')));
            }
        }

        return ans.toString();
    }

}
