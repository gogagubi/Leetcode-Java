package com.leetcode.example.string;


import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

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
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : S.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> queue = new PriorityQueue<>((o1, o2) -> counts.get(o2) - counts.get(o1));
        queue.addAll(counts.keySet());

        StringBuilder result = new StringBuilder();
        while (queue.size() >= 2) {
            char current = queue.remove();
            char next = queue.remove();

            result.append(current);
            result.append(next);

            counts.put(current, counts.get(current) - 1);
            counts.put(next, counts.get(next) - 1);

            if (counts.get(current) > 0) {
                queue.add(current);
            }

            if (counts.get(next) > 0) {
                queue.add(next);
            }
        }

        if(!queue.isEmpty()){
            char last = queue.remove();
            if(counts.get(last) > 1){
                return "";
            }

            result.append(last);
        }

        return result.toString();
    }

}
