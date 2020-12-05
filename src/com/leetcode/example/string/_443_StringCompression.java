package com.leetcode.example.string;

public class _443_StringCompression {
    public static void main(String[] args) {
        if (false) {
            _443_StringCompression c = new _443_StringCompression();

            char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
            System.out.println("Compressed " + c.compress(chars));
        }

        if (false) {
            _443_StringCompression c = new _443_StringCompression();

            char[] chars = {'a'};
            System.out.println("Compressed " + c.compress(chars));
        }


        if (true) {
            _443_StringCompression c = new _443_StringCompression();

            char[] chars = {'a','a','a','b','b','a','a'};
            System.out.println("Compressed " + c.compress(chars));
        }

    }

    public int compress(char[] chars) {
        int result = 0, left = 0, right;
        while (left < chars.length) {
            right = left;
            while (right < chars.length && chars[left] == chars[right]) {
                right++;
            }

            chars[result++] = chars[left];
            if (right - left > 1) {
                String count = (right - left) + "";
                for (char c : count.toCharArray()) {
                    chars[result++] = c;
                }
            }

            left = right;
        }

        return result;
    }

}
