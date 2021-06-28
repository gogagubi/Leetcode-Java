package com.leetcode.challenge.array.JuneChallenge2021;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

//2021-06-16
public class GenerateParentheses {

    @Test
    public void testCase1() {
        GenerateParentheses c = new GenerateParentheses();
        int n = 3;
        assertEquals(Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()"), c.generateParenthesis(n));
    }


    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(0, 0, n, new LinkedList<>(), ans);
        return ans;
    }

    private void backtrack(int open, int close, int n, LinkedList<Character> list, List<String> ans) {
        if (list.size() == 2 * n) {
            StringBuilder builder = new StringBuilder();
            for (char c : list) builder.append(c);
            ans.add(builder.toString());
            return;
        }

        if (open < n) {
            list.add('(');
            backtrack(open + 1, close, n, list, ans);
            list.removeLast();
        }
        if (close < open) {
            list.add(')');
            backtrack(open, close + 1, n, list, ans);
            list.removeLast();
        }
    }


}
