package com.leetcode.example.stack;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _20_ValidParentheses {
    public static void main(String[] args) {
        if (true) {
            _20_ValidParentheses c = new _20_ValidParentheses();

            String s = "()";
            System.out.println("Is Valid " + c.isValid(s));
        }

        if (true) {
            _20_ValidParentheses c = new _20_ValidParentheses();

            String s = "()[]{}";
            System.out.println("Is Valid " + c.isValid(s));
        }

        if (true) {
            _20_ValidParentheses c = new _20_ValidParentheses();

            String s = "(]";
            System.out.println("Is Valid " + c.isValid(s));
        }

        if (true) {
            _20_ValidParentheses c = new _20_ValidParentheses();

            String s = "([)]";
            System.out.println("Is Valid " + c.isValid(s));
        }

        if (true) {
            _20_ValidParentheses c = new _20_ValidParentheses();

            String s = "{[]}";
            System.out.println("Is Valid " + c.isValid(s));
        }

        if (true) {
            _20_ValidParentheses c = new _20_ValidParentheses();

            String s = "";
            System.out.println("Is Valid " + c.isValid(s));
        }

        if (true) {
            _20_ValidParentheses c = new _20_ValidParentheses();

            String s = "((";
            System.out.println("Is Valid " + c.isValid(s));
        }

        if (true) {
            _20_ValidParentheses c = new _20_ValidParentheses();

            String s = "]";
            System.out.println("Is Valid " + c.isValid(s));
        }

        if (true) {
            _20_ValidParentheses c = new _20_ValidParentheses();

            String s = "){";
            System.out.println("Is Valid " + c.isValid(s));
        }
    }

    //O(n) time, O(1) memory
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i ++){
            char curr = s.charAt(i);

            if(curr == ')' || curr == '}' || curr == ']'){
                if(stack.isEmpty()) return false;

                if(curr == ')' && stack.peek() != '(') return false;
                if(curr == ']' && stack.peek() != '[') return false;
                if(curr == '}' && stack.peek() != '{') return false;

                stack.pop();
            }
            else{
                stack.push(curr);
            }
        }

        return stack.isEmpty();
    }

    public boolean isValid1(String s) {
        int open = 0, close = 0;
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        for (int i = 0; i < s.length(); i++) {
            if (map.keySet().contains(s.charAt(i))) {
                stack.add(s.charAt(i));
                open++;
            } else {
                if (open <= close || map.get(stack.pop()) != s.charAt(i)) {
                    return false;
                }

                close++;
            }
        }

        return open == close;
    }



}
