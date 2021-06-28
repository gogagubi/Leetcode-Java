package com.leetcode.example.two_pointers;

public class _844_BackspaceStringCompare {
    public static void main(String[] args) {
        if (true) {
            _844_BackspaceStringCompare c = new _844_BackspaceStringCompare();

            String S = "ab#c";
            String T = "ad#c";
            System.out.println("Is compared = " + c.backspaceCompare(S, T));
        }

        if (true) {
            _844_BackspaceStringCompare c = new _844_BackspaceStringCompare();

            String S = "ab##";
            String T = "c#d#";
            System.out.println("Is compared = " + c.backspaceCompare(S, T));
        }

        if (true) {
            _844_BackspaceStringCompare c = new _844_BackspaceStringCompare();

            String S = "a##c";
            String T = "#a#c";
            System.out.println("Is compared = " + c.backspaceCompare(S, T));
        }

        if (true) {
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
        int i = next(S, S.length() - 1);
        int j = next(T, T.length() - 1);

        while (i >= 0 && j >= 0 && S.charAt(i) == T.charAt(j)) {
            i = next(S, i - 1);
            j = next(T, j - 1);
        }

        return i == -1 && j == -1;
    }

    public int next(String s, int i) {
        int skips = 0;

        while (i >= 0) {
            if (s.charAt(i) == '#') skips++;
            else if (skips > 0) skips--;
            else return i;

            i--;
        }

        return -1;
    }
}
