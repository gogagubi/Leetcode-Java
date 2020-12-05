package com.leetcode.example.string;


import java.util.HashMap;

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
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), -1);
            } else {
                map.put(s.charAt(i), i);
            }
        }

        int min = Integer.MAX_VALUE;
        for (Character c : map.keySet()) {
            if (map.get(c) != -1) {
                min = Math.min(map.get(c), min);
            }
        }


        return min == Integer.MAX_VALUE ? -1 : min;
    }


}
