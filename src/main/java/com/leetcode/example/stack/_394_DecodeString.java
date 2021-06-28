package com.leetcode.example.stack;


import java.util.Stack;

public class _394_DecodeString {
    public static void main(String[] args) {
        if (false) {
            _394_DecodeString c = new _394_DecodeString();

            String s = "3[a]2[bc]";
            System.out.println("Addition result = " + c.decodeString(s));
        }

        if (true) {
            _394_DecodeString c = new _394_DecodeString();

            String s = "3[a2[c]]";
            System.out.println("Addition result = " + c.decodeString(s));
        }

        if (false) {
            _394_DecodeString c = new _394_DecodeString();

            String s = "2[abc]3[cd]ef";
            System.out.println("Addition result = " + c.decodeString(s));
        }
    }

    public String decodeString(String s) {
        Stack<Integer> times = new Stack<>();
        Stack<String> chunks = new Stack<>();
        StringBuilder result = new StringBuilder();
        int pointer = 0;

        while (pointer < s.length()) {
            char current = s.charAt(pointer);
            if ((current - '0') >= 0 && (current - '0') <= 9) {
                int count = 0;
                while ((s.charAt(pointer) - '0') >= 0 && (s.charAt(pointer) - '0' <= 9)) {
                    count = 10 * count + s.charAt(pointer) - '0';
                    pointer++;
                }
                times.push(count);
            } else if (current == '[') {
                chunks.push(result.toString());
                result = new StringBuilder();
                pointer++;
            } else if (current == ']') {
                StringBuilder builder = new StringBuilder(chunks.pop());
                int count = times.pop();
                for (int i = 0; i < count; i++) {
                    builder.append(result);
                }
                result = builder;
                pointer++;
            } else {
                result.append(s.charAt(pointer));
                pointer++;
            }
        }

        return result.toString();
    }

}
