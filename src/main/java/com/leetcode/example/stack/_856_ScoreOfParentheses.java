package com.leetcode.example.stack;


import java.util.Stack;

public class _856_ScoreOfParentheses {
    public static void main(String[] args) {
        if (true) {
            _856_ScoreOfParentheses c = new _856_ScoreOfParentheses();

            String S = "()";
            System.out.println(c.scoreOfParentheses(S));
        }

        if (true) {
            _856_ScoreOfParentheses c = new _856_ScoreOfParentheses();

            String S = "(())";
            System.out.println(c.scoreOfParentheses(S));
        }

        if (true) {
            _856_ScoreOfParentheses c = new _856_ScoreOfParentheses();

            String S = "()()";
            System.out.println(c.scoreOfParentheses(S));
        }

        if (true) {
            _856_ScoreOfParentheses c = new _856_ScoreOfParentheses();

            String S = "(()(()))";
            System.out.println(c.scoreOfParentheses(S));
        }

        if (true) {
            _856_ScoreOfParentheses c = new _856_ScoreOfParentheses();

            String S = "(())()";
            System.out.println(c.scoreOfParentheses(S));
        }
    }


    public int scoreOfParentheses(String S) {
        int ans = 0;
        Stack<Integer> stack = new Stack<>();

        for (char c : S.toCharArray()) {
            if (c == '(') {
                stack.add(ans);
                ans = 0;
            } else {
                ans = stack.pop() + Math.max(1, ans * 2);
            }
        }

        return ans;
    }

}
