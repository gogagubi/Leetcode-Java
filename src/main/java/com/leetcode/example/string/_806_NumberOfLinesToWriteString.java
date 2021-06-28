package com.leetcode.example.string;


import com.leetcode.statics.util.Util;

public class _806_NumberOfLinesToWriteString {
    public static void main(String[] args) {
        if (true) {
            _806_NumberOfLinesToWriteString c = new _806_NumberOfLinesToWriteString();

            int[] widths = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
            String S = "abcdefghijklmnopqrstuvwxyz";
            System.out.println("Lines and last line width " + Util.getPrintedArr(c.numberOfLines(widths, S)));
        }

        if (true) {
            _806_NumberOfLinesToWriteString c = new _806_NumberOfLinesToWriteString();

            int[] widths = {4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
            String S = "bbbcccdddaaa";
            System.out.println("Lines and last line width " + Util.getPrintedArr(c.numberOfLines(widths, S)));
        }
    }

    public int[] numberOfLines(int[] widths, String S) {
        int numberOfLines = 1, lastLineWidth = 0;
        int n = S.length();

        for (int i = 0; i < n; i++) {
            int charIndex = S.charAt(i) - 'a';

            if (lastLineWidth + widths[charIndex] > 100) {
                numberOfLines += 1;
                lastLineWidth = 0;
            }

            lastLineWidth += widths[charIndex];
        }

        return new int[]{numberOfLines, lastLineWidth};
    }


}
