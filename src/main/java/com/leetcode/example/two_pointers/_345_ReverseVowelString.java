package com.leetcode.example.two_pointers;


import java.util.HashSet;
import java.util.Set;

public class _345_ReverseVowelString {
    public static void main(String[] args) {
        if (true) {
            _345_ReverseVowelString c = new _345_ReverseVowelString();

            String s = "hello";
            System.out.println("Reversed wovel " + c.reverseVowels(s));
        }

        if (true) {
            _345_ReverseVowelString c = new _345_ReverseVowelString();

            String s = "leetcode";
            System.out.println("Reversed wovel " + c.reverseVowels(s));
        }

    }

    private String reverseVowels(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        int l = 0, r = s.length() - 1;
        char[] arr = s.toCharArray();
        Set<Character> vowels = getWovels();

        while (l < r) {
            if (!vowels.contains(arr[l])) {
                l++;
                continue;
            }

            if (!vowels.contains(arr[r])) {
                r--;
                continue;
            }

            char tmp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = tmp;
        }

        return new String(arr, 0, s.length());
    }

    private Set<Character> getWovels() {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        return vowels;
    }


}
