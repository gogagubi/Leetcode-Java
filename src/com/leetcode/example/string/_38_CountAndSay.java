package com.leetcode.example.string;


import java.util.HashSet;

public class _38_CountAndSay {
    public static void main(String[] args) {
        if (true) {
            _38_CountAndSay c = new _38_CountAndSay();

            int n = 5;
            System.out.println("Result " + c.countAndSay(n));
        }
    }

    public String countAndSay(int n) {
        StringBuilder result = new StringBuilder();
        if (n < 1) return result.toString();

        result.append("1");
        n--;

        int index, count;
        while (n-- > 0) {
            StringBuilder tmp = new StringBuilder();
            index = 0;
            while (index < result.length()) {
                count = 1;
                while (index + 1 < result.length() && result.charAt(index) == result.charAt(index + 1)) {
                    index++;
                    count++;
                }

                tmp.append(count).append(result.charAt(index++));
            }
            result = tmp;
        }

        return result.toString();
    }

}
