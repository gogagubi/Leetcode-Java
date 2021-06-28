package com.leetcode.example.two_pointers;


public class _344_ReverseString {
    public static void main(String[] args) {
        if (true) {
            _344_ReverseString c = new _344_ReverseString();

            char[] s = {'h', 'e', 'l', 'l', 'o'};
            c.reverseString(s);
            for (char a : s) {
                System.out.print(a);
            }
            System.out.println();
        }

        if (true) {
            _344_ReverseString c = new _344_ReverseString();

            char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
            c.reverseString(s);
            for (char a : s) {
                System.out.print(a);
            }
            System.out.println();
        }
    }

    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;

        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;

            left++;
            right--;
        }
    }

}
