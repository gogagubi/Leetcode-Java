package com.leetcode.example.string;


public class _796_RotateString {
    public static void main(String[] args) {
        if (true) {
            _796_RotateString c = new _796_RotateString();

            String A = "abcde";
            String B = "cdeab";
            System.out.println("Are rotated " + c.rotateString(A, B));
        }

    }

    public boolean rotateString(String A, String B) {
        return A.length() == B.length() && (A + A).contains(B);
    }

}
