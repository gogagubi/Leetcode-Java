package com.leetcode.example.string;


public class _387_FirstUniqueCharacterInStringV2 {
    public static void main(String[] args) {
        if (true) {
            _387_FirstUniqueCharacterInStringV2 c = new _387_FirstUniqueCharacterInStringV2();

            String s = "leetcode";
            System.out.println("First unique index " + c.firstUniqChar(s));
        }

        if (true) {
            _387_FirstUniqueCharacterInStringV2 c = new _387_FirstUniqueCharacterInStringV2();

            String s = "loveleetcode";
            System.out.println("First unique index " + c.firstUniqChar(s));
        }

        if (true) {
            _387_FirstUniqueCharacterInStringV2 c = new _387_FirstUniqueCharacterInStringV2();

            String s = "cc";
            System.out.println("First unique index " + c.firstUniqChar(s));
        }
    }

    public int firstUniqChar(String s) {
        int result = -1;
        if (s.length() == 0) {
            return result;
        }

        int start = 0;
        st:
        for (int i = start; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    start++;
                    continue st;
                }
            }

            result = i;
            break;
        }

        return result;
    }


}
