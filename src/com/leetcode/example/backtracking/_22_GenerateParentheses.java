package com.leetcode.example.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class _22_GenerateParentheses {
    public static void main(String[] args) {
        if (true) {
            _22_GenerateParentheses c = new _22_GenerateParentheses();

            int n = 3;
            System.out.println("All cases " + c.generateParenthesis(n));
        }

    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new LinkedList<>(), 0, 0, n);
        return result;
    }

    public void backtrack(List<String> result, LinkedList<Character> current, int open, int close, int limit) {
        if (current.size() == limit * 2) {
            StringBuilder builder = new StringBuilder();
            for (Character c : current) {
                builder.append(c);
            }

            result.add(builder.toString());
            return;
        }

        if (open < limit) {
            current.add('(');
            backtrack(result, current, open + 1, close, limit);
            current.removeLast();
        }
        if (close < open) {
            current.add(')');
            backtrack(result, current, open, close + 1, limit);
            current.removeLast();
        }
    }


}
