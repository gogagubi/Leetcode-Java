package com.leetcode.example.string;

public class _844_BackspaceStringCompare {
    public static void main(String[] args) {
        if (false) {
            _844_BackspaceStringCompare c = new _844_BackspaceStringCompare();

            String S = "ab#c";
            String T = "ad#c";
            System.out.println("Is compared = " + c.backspaceCompare(S, T));
        }

        if (false) {
            _844_BackspaceStringCompare c = new _844_BackspaceStringCompare();

            String S = "ab##";
            String T = "c#d#";
            System.out.println("Is compared = " + c.backspaceCompare(S, T));
        }

        if (false) {
            _844_BackspaceStringCompare c = new _844_BackspaceStringCompare();

            String S = "a##c";
            String T = "#a#c";
            System.out.println("Is compared = " + c.backspaceCompare(S, T));
        }

        if (false) {
            _844_BackspaceStringCompare c = new _844_BackspaceStringCompare();

            String S = "a#c";
            String T = "b";
            System.out.println("Is compared = " + c.backspaceCompare(S, T));
        }

        if (true) {
            _844_BackspaceStringCompare c = new _844_BackspaceStringCompare();

            String S = "a#c";
            String T = "a#cc";
            System.out.println("Is compared = " + c.backspaceCompare(S, T));
        }
    }

    public boolean backspaceCompare(String S, String T) {
        int S_pointer = S.length() - 1;
        int T_pointer = T.length() - 1;

        int S_skips = 0;
        int T_skips = 0;

        while (S_pointer >= 0 || T_pointer >= 0) {

            while (S_pointer >= 0) {
                if (S.charAt(S_pointer) == '#') {
                    S_skips ++;
                    S_pointer --;
                } else if (S_skips > 0) {
                    S_skips --;
                    S_pointer --;
                } else {
                    break;
                }
            }

            while (T_pointer >= 0) {
                if (T.charAt(T_pointer) == '#') {
                    T_skips ++;
                    T_pointer --;
                } else if (T_skips > 0) {
                    T_skips --;
                    T_pointer --;
                } else {
                    break;
                }
            }

            if (S_pointer >= 0 && T_pointer >= 0 && S.charAt(S_pointer) != T.charAt(T_pointer)) {
                return false;
            }

            if ((S_pointer >= 0) != (T_pointer >= 0)) {
                return false;
            }

            S_pointer -= 1;
            T_pointer -= 1;
        }

        return true;
    }

}
