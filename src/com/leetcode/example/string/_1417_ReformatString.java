package com.leetcode.example.string;


import java.util.LinkedList;
import java.util.Queue;

public class _1417_ReformatString {
    public static void main(String[] args) {
        if (false) {
            _1417_ReformatString c = new _1417_ReformatString();

            String s = "a0b1c2";
            System.out.println("Formated string " + c.reformat(s));
        }

        if (false) {
            _1417_ReformatString c = new _1417_ReformatString();

            String s = "leetcode";
            System.out.println("Formated string " + c.reformat(s));
        }

        if (false) {
            _1417_ReformatString c = new _1417_ReformatString();

            String s = "covid2019";
            System.out.println("Formated string " + c.reformat(s));
        }

        if (true) {
            _1417_ReformatString c = new _1417_ReformatString();

            String s = "a0b1c2";
            System.out.println("Formated string " + c.reformat(s));
        }
    }

    public String reformat(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s;
        }

        StringBuilder result = new StringBuilder("");
        Queue<Character> alphabets = new LinkedList<>();
        Queue<Character> digits = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (Character.isDigit(current)) {
                digits.add(current);
            } else {
                alphabets.add(current);
            }
        }

        int diff = digits.size() - alphabets.size();
        if (diff < -1 || diff > 1) {
            return result.toString();
        }

        char prev = digits.size() > alphabets.size() ? digits.poll() : alphabets.poll();
        result.append(prev);
        while (!alphabets.isEmpty() || !digits.isEmpty()) {
            result.append(prev = (Character.isDigit(prev) ? alphabets.poll() : digits.poll()));
        }

        return result.toString();
    }


}
