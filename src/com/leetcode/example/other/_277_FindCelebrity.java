package com.leetcode.example.other;

public class _277_FindCelebrity {
    public static void main(String[] args) {
        //example 1
        if (true) {
            _277_FindCelebrity c = new _277_FindCelebrity();
            System.out.println("Candidate = " + c.findCelebrity(20));
            System.out.println("Candidate = " + c.findCelebrityV2(20));
        }

    }

    public int findCelebrity(int n) {
        int candidate = 0;

        for (int i = 1; i < n; i++) {
            if (knows(candidate, i)) {
                candidate = i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i != candidate && knows(candidate, i) || !knows(i, candidate)) {
                return -1;
            }
        }

        return candidate;
    }

    public int findCelebrityV2(int n) {
        int celebrity = -1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && knows(i, j) && !knows(j, i)) {
                    celebrity = j;
                    count++;
                }
            }
        }

        if (count == n - 1) {
            return celebrity;
        }

        return -1;
    }

    public boolean knows(int a, int b) {
        if (b == 16) {
            return true;
        }

        return false;
    }
}
