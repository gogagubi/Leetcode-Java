package com.leetcode.example.greedy;


import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class _767_ReorganizeString {
    public static void main(String[] args) {
        if (true) {
            _767_ReorganizeString c = new _767_ReorganizeString();

            String S = "aab";
            System.out.println("Result " + c.reorganizeString(S));
        }

        if (true) {
            _767_ReorganizeString c = new _767_ReorganizeString();

            String S = "aaab";
            System.out.println("Result " + c.reorganizeString(S));
        }
    }

    public String reorganizeString(String S) {
        int[] ascii = new int[127];
        for (char c : S.toCharArray()) ascii[c]++;

        Queue<int[]> maxHeap = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]);
        for (int i = 0; i < ascii.length; i++) {
            if (ascii[i] > 0) {
                maxHeap.add(new int[]{i, ascii[i]});
            }
        }

        StringBuilder result = new StringBuilder();
        while (maxHeap.size() >= 2) {
            int[] curr = maxHeap.remove();
            int[] next = maxHeap.remove();

            result.append((char) curr[0]);
            result.append((char) next[0]);

            if (curr[1] > 1) {
                maxHeap.add(new int[]{curr[0], curr[1] - 1});
            }

            if (next[1] > 1) {
                maxHeap.add(new int[]{next[0], next[1] - 1});
            }
        }

        if (!maxHeap.isEmpty()) {
            int[] curr = maxHeap.remove();
            if (curr[1] > 1) {
                return "";
            }

            result.append((char) curr[0]);
        }

        return result.toString();
    }

}
