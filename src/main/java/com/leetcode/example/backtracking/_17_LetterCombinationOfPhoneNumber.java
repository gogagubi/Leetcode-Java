package com.leetcode.example.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _17_LetterCombinationOfPhoneNumber {
    public static void main(String[] args) {
        //example 1
        if (true) {
            _17_LetterCombinationOfPhoneNumber c = new _17_LetterCombinationOfPhoneNumber();
            System.out.println("combinations = " + c.letterCombinations("23"));
        }


    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }

        String[] nums = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        letterCombinationRecursive(result, digits, 0, nums, new LinkedList<>());
        return result;
    }

    public void letterCombinationRecursive(List<String> result, String digits, int position,
                                           String[] nums, LinkedList<Character> current) {
        if (position == digits.length()) {
            StringBuilder builder = new StringBuilder();
            for (Character c : current) {
                builder.append(c);
            }
            result.add(builder.toString());
            return;
        }

        String letters = nums[digits.charAt(position) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            current.add(letters.charAt(i));
            letterCombinationRecursive(result, digits, position + 1, nums, current);
            current.removeLast();
        }
    }

}
