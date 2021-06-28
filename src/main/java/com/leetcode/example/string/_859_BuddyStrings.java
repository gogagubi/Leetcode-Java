package com.leetcode.example.string;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _859_BuddyStrings {
    public static void main(String[] args) {
        if (true) {
            _859_BuddyStrings c = new _859_BuddyStrings();

            String A = "ab";
            String B = "ba";
            System.out.println("Result " + c.buddyStrings(A, B));
        }

        if (true) {
            _859_BuddyStrings c = new _859_BuddyStrings();

            String A = "ab";
            String B = "ab";
            System.out.println("Result " + c.buddyStrings(A, B));
        }

        if (true) {
            _859_BuddyStrings c = new _859_BuddyStrings();

            String A = "aa";
            String B = "aa";
            System.out.println("Result " + c.buddyStrings(A, B));
        }

        if (true) {
            _859_BuddyStrings c = new _859_BuddyStrings();

            String A = "abab";
            String B = "abab";
            System.out.println("Result " + c.buddyStrings(A, B));
        }

        if (true) {
            _859_BuddyStrings c = new _859_BuddyStrings();

            String A = "aaaaaaabc";
            String B = "aaaaaaacb";
            System.out.println("Result " + c.buddyStrings(A, B));
        }

        if (true) {
            _859_BuddyStrings c = new _859_BuddyStrings();

            String A = "abcd";
            String B = "badc";
            System.out.println("Result " + c.buddyStrings(A, B));
        }
    }

    public boolean buddyStrings(String A, String B) {
        int n = A.length();
        int m = B.length();

        if (n != m) return false;

        if (A.equals(B)) {
            Set<Character> uniqs = new HashSet<>();
            for (char c : A.toCharArray()) uniqs.add(c);
            return uniqs.size() < n;
        }

        List<Character> a = new ArrayList<>();
        List<Character> b = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                a.add(A.charAt(i));
                b.add(B.charAt(i));
            }
        }

        return a.size() == 2 && b.size() == 2 && a.get(0) == b.get(1) && a.get(1) == b.get(0);
    }
}
