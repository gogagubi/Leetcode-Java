package com.leetcode.example.two_pointers;


public class _28_ImplementStrStr {
    public static void main(String[] args) {
        if (true) {
            _28_ImplementStrStr c = new _28_ImplementStrStr();

            String haystack = "hello";
            String needle = "ll";
            System.out.println("First occurence = " + c.strStr(haystack, needle));
        }

        if (true) {
            _28_ImplementStrStr c = new _28_ImplementStrStr();

            String haystack = "aaaaa";
            String needle = "bba";
            System.out.println("First occurence = " + c.strStr(haystack, needle));
        }

        if (true) {
            _28_ImplementStrStr c = new _28_ImplementStrStr();

            String haystack = "";
            String needle = "a";
            System.out.println("First occurence = " + c.strStr(haystack, needle));
        }

        if (true) {
            _28_ImplementStrStr c = new _28_ImplementStrStr();

            String haystack = "aaa";
            String needle = "aaaa";
            System.out.println("First occurence = " + c.strStr(haystack, needle));
        }

        if (true) {
            _28_ImplementStrStr c = new _28_ImplementStrStr();

            String haystack = "mississippi";
            String needle = "issip";
            System.out.println("First occurence = " + c.strStr(haystack, needle));
        }

        if (true) {
            _28_ImplementStrStr c = new _28_ImplementStrStr();

            String haystack = "mississippi";
            String needle = "issipi";
            System.out.println("First occurence = " + c.strStr(haystack, needle));
        }

        if (true) {
            _28_ImplementStrStr c = new _28_ImplementStrStr();

            String haystack = "a";
            String needle = "a";
            System.out.println("First occurence = " + c.strStr(haystack, needle));
        }

        if (true) {
            _28_ImplementStrStr c = new _28_ImplementStrStr();

            String haystack = "";
            String needle = "";
            System.out.println("First occurence = " + c.strStr(haystack, needle));
        }
    }


    public int strStr(String haystack, String needle) {
        int result = -1, j;
        if (needle.length() == 0) {
            return 0;
        }

        if (haystack.length() < needle.length()) {
            return result;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                for (j = i; j < i + needle.length(); j++) {
                    if (j > haystack.length() - 1
                            || haystack.charAt(j) != needle.charAt(j - i)) {
                        break;
                    }
                    if (j == (i + needle.length() - 1)) {
                        return i;
                    }
                }
            }
        }

        return result;
    }


}
