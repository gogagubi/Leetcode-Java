package com.leetcode.example.string;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class _859_BuddyStrings {
    public static void main(String[] args) {
        if (false) {
            _859_BuddyStrings c = new _859_BuddyStrings();

            String A = "ab";
            String B = "ba";
            System.out.println("Result " + c.buddyStrings(A, B));
        }

        if (false) {
            _859_BuddyStrings c = new _859_BuddyStrings();

            String A = "ab";
            String B = "ab";
            System.out.println("Result " + c.buddyStrings(A, B));
        }

        if (false) {
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

        if (false) {
            _859_BuddyStrings c = new _859_BuddyStrings();

            String A = "aaaaaaabc";
            String B = "aaaaaaacb";
            System.out.println("Result " + c.buddyStrings(A, B));
        }
    }

    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }

        if (A.equals(B)) {
            HashSet<Character> uniqs = new HashSet<>();
            for (char c : A.toCharArray()) {
                uniqs.add(c);
            }

            return uniqs.size() < A.length();
        }

        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                a.append(A.charAt(i));
                b.append(B.charAt(i));
            }
        }

        if (a.length() != 2 || b.length() != 2) {
            return false;
        }

        return a.reverse().toString().equals(b.toString());
    }

    public boolean buddyStrings1(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }

        if (A.equals(B)) {
            HashSet<Character> uniqueChars = new HashSet<>();
            for (char c : A.toCharArray()) {
                uniqueChars.add(c);
            }

            return uniqueChars.size() < A.length();
        }

        List<Integer> diff = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                diff.add(i);
            }
        }

        if (diff.size() == 2 && A.charAt(diff.get(0)) == B.charAt(diff.get(1))
                && B.charAt(diff.get(0)) == A.charAt(diff.get(1))) {
            return true;
        }

        return false;
    }

}
