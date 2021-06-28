package com.leetcode.example.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _784_LeterCasePermutation {
    public static void main(String[] args) {
        if (true) {
            _784_LeterCasePermutation c = new _784_LeterCasePermutation();

            String S = "a1b2";
            System.out.println("All cases " + c.letterCasePermutation(S));
        }


    }

    public List<String> letterCasePermutation(String S) {
        List<String> result = new ArrayList<>();
        backtrack(S, 0, new LinkedList<>(), result);

        return result;
    }

    public void backtrack(String S, int position, LinkedList<Character> str, List<String> results) {
        if (position == S.length()) {
            StringBuilder result = new StringBuilder();
            for (Character c : str) {
                result.append(c);
            }
            results.add(result.toString());
            return;
        }

        char current = S.charAt(position);
        if (Character.isAlphabetic(current)) {
            str.add(Character.toLowerCase(current));
            backtrack(S, position + 1, str, results);
            str.removeLast();

            str.add(Character.toUpperCase(current));
            backtrack(S, position + 1, str, results);
            str.removeLast();

        } else {
            str.add(current);
            backtrack(S, position + 1, str, results);
            str.removeLast();
        }
    }

}
