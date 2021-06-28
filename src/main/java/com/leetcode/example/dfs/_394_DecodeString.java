package com.leetcode.example.dfs;

import java.util.LinkedList;
import java.util.Queue;

public class _394_DecodeString {
    public static void main(String[] args) {
        if (true) {
            _394_DecodeString c = new _394_DecodeString();

            String s = "3[a]2[bc]";
            System.out.println("Addition result = " + c.decodeString(s));
        }

        if (true) {
            _394_DecodeString c = new _394_DecodeString();

            String s = "3[a2[c]]";
            System.out.println("Addition result = " + c.decodeString(s));
        }

        if (true) {
            _394_DecodeString c = new _394_DecodeString();

            String s = "2[abc]3[cd]ef";
            System.out.println("Addition result = " + c.decodeString(s));
        }
    }

    private String decodeString(String s) {
        Queue<Character> queue = new LinkedList<>();
        for (char c : s.toCharArray()) {
            queue.add(c);
        }

        return dfs(queue);
    }

    private String dfs(Queue<Character> queue) {
        StringBuilder ans = new StringBuilder();
        int times = 0;

        while (!queue.isEmpty()) {
            char curr = queue.poll();

            if (Character.isDigit(curr)) {
                times = (times * 10) + (curr - '0');
            } else if (curr >= 'a' && curr <= 'z') {
                ans.append(curr);
            } else if (curr == '[') {
                String tmp = dfs(queue);
                for (int i = 0; i < times; i++) {
                    ans.append(tmp);
                }
                times = 0;
            }

            if (curr == ']') break;
        }

        return ans.toString();
    }
}
