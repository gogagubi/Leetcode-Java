package com.leetcode.example.string;

public class _387_FirstUniqueCharacterInString {
    public static void main(String[] args) {
        if (true) {
            _387_FirstUniqueCharacterInString c = new _387_FirstUniqueCharacterInString();

            String s = "leetcode";
            System.out.println("First unique index " + c.firstUniqChar(s));
        }

        if (true) {
            _387_FirstUniqueCharacterInString c = new _387_FirstUniqueCharacterInString();

            String s = "loveleetcode";
            System.out.println("First unique index " + c.firstUniqChar(s));
        }

        if (true) {
            _387_FirstUniqueCharacterInString c = new _387_FirstUniqueCharacterInString();

            String s = "cc";
            System.out.println("First unique index " + c.firstUniqChar(s));
        }
    }

    public int firstUniqChar(String s) {
        int[] ascii = new int[26];

        for (int i = 0; i < s.length(); i++) {
            ascii[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (ascii[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }


}
