package com.leetcode.example.string;

public class _1816_TruncateSentence {
    public static void main(String[] args) {
        if (true) {
            _1816_TruncateSentence o = new _1816_TruncateSentence();
            String s = "Hello how are you Contestant";
            int k = 4;

            System.out.println(o.truncateSentence(s, k));
        }

        if (true) {
            _1816_TruncateSentence o = new _1816_TruncateSentence();
            String s = "What is the solution to this problem";
            int k = 4;

            System.out.println(o.truncateSentence(s, k));
        }

        if (true) {
            _1816_TruncateSentence o = new _1816_TruncateSentence();
            String s = "chopper is not a tanuki";
            int k = 5;

            System.out.println(o.truncateSentence(s, k));
        }
    }


    public String truncateSentence(String s, int k) {
        StringBuilder ans = new StringBuilder();

        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') count++;
            if (count == k) break;

            ans.append(c);
        }

        return ans.toString();
    }

}
