package com.leetcode.example.string;


import java.util.HashSet;

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

    public String reverseVowels(String s) {
        if (s == null && s.length() == 0) {
            return s;
        }

        HashSet<Character> vowels = new HashSet<>();
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

        int left = 0, right = s.length() - 1;
        char[] buffer = s.toCharArray();

        while (left < right) {
            while (left < right && !vowels.contains(buffer[left])) {
                left++;
            }
            while (left < right && !vowels.contains(buffer[right])) {
                right--;
            }

            char tmp = buffer[left];
            buffer[left++] = buffer[right];
            buffer[right--] = tmp;
        }

        return new String(buffer, 0, s.length());
    }


}
