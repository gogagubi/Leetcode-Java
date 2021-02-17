package com.leetcode.example.sliding_window;


import java.util.HashSet;

public class _3_LongestSubstringWithoutRepeatingCharactes {
    public static void main(String[] args) {
        if (true) {
            _3_LongestSubstringWithoutRepeatingCharactes c = new _3_LongestSubstringWithoutRepeatingCharactes();

            String s = "abcabcbb";
            System.out.println("Longest disting substring " + c.lengthOfLongestSubstring(s));
        }

        if (true) {
            _3_LongestSubstringWithoutRepeatingCharactes c = new _3_LongestSubstringWithoutRepeatingCharactes();

            String s = "bbbbb";
            System.out.println("Longest disting substring " + c.lengthOfLongestSubstring(s));
        }

        if (true) {
            _3_LongestSubstringWithoutRepeatingCharactes c = new _3_LongestSubstringWithoutRepeatingCharactes();

            String s = "pwwkew";
            System.out.println("Longest disting substring " + c.lengthOfLongestSubstring(s));
        }
    }

    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        HashSet<Character> set = new HashSet<>();
        int max = 0;

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;

                max = Math.max(set.size(), max);
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return max;
    }

}
