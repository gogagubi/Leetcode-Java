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
        int[] res = new int[2];
        if (S == null || S.length() == 0) {
            return res;
        }

        int sum = 0, lines = 1, limit = 100;

        for (int i = 0; i < S.length(); i++) {
            int width = widths[(S.charAt(i) - 'a')];

            if (sum + width > limit) {
                sum = 0;
                lines++;
            }

            sum += width;
        }

        res[0] = lines;
        res[1] = sum;

        return res;
    }


}
