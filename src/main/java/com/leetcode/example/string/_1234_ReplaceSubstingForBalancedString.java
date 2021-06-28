package com.leetcode.example.string;


import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class _1234_ReplaceSubstingForBalancedString {
    public static void main(String[] args) {
        if (false) {
            _1234_ReplaceSubstingForBalancedString c = new _1234_ReplaceSubstingForBalancedString();

            String s = "QWER";
            System.out.println("Result " + c.balancedString(s));
        }

        if (false) {
            _1234_ReplaceSubstingForBalancedString c = new _1234_ReplaceSubstingForBalancedString();

            String s = "QQWE";
            System.out.println("Result " + c.balancedString(s));
        }

        if (false) {
            _1234_ReplaceSubstingForBalancedString c = new _1234_ReplaceSubstingForBalancedString();

            String s = "QQQW";
            System.out.println("Result " + c.balancedString(s));
        }

        if (false) {
            _1234_ReplaceSubstingForBalancedString c = new _1234_ReplaceSubstingForBalancedString();

            String s = "QQQQ";
            System.out.println("Result " + c.balancedString(s));
        }

        if (false) {
            _1234_ReplaceSubstingForBalancedString c = new _1234_ReplaceSubstingForBalancedString();

            String s = "WQWRQQQW";
            System.out.println("Result " + c.balancedString(s));
        }

        if (false) {
            _1234_ReplaceSubstingForBalancedString c = new _1234_ReplaceSubstingForBalancedString();

            String s = "WWQQRRRRQRQQ";
            System.out.println("Result " + c.balancedString(s));
        }


        if (true) {
            _1234_ReplaceSubstingForBalancedString c = new _1234_ReplaceSubstingForBalancedString();

            String s = "WWEQERQWQWWRWWERQWEQ";
            System.out.println("Result " + c.balancedString(s));
        }

        if (true) {
            _1234_ReplaceSubstingForBalancedString c = new _1234_ReplaceSubstingForBalancedString();

            String s = "QQQWEEER";
            System.out.println("Result " + c.balancedString(s));
        }
    }

    public int balancedString(String s) {
        int n = s.length();
        Queue<Pair> maxHeap = buildMaxHeap(s);

        int ans = 0;
        while(!maxHeap.isEmpty()){
            Pair curr = maxHeap.poll();
            if(curr.count > n / 4){
                ans += (curr.count - (n/4));
            }
            else{
                break;
            }
        }

        return ans;
    }

    class Pair {
        char c;
        int count;

        public Pair(char c, int count) {
            this.c = c;
            this.count = count;
        }
    }

    private Queue<Pair> buildMaxHeap(String s) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('Q', 0);
        m.put('W', 0);
        m.put('E', 0);
        m.put('R', 0);

        for (char c : s.toCharArray()) {
            m.put(c, m.get(c) + 1);
        }

        Queue<Pair> maxHeap = new PriorityQueue<>((a, b) -> b.count - a.count);
        for(char key: m.keySet()){
            maxHeap.add(new Pair(key, m.get(key)));
        }
        return maxHeap;
    }

    public int balancedString22(String s) {
        int length = s.length();
        int[] qwer = new int[4];

        for (int i = 0; i < length; i++) {
            qwer[qwerToIndex(s.charAt(i))]++;
        }
        int balance = length / 4;
        if (isBalanced(qwer, balance)) {
            return 0;
        }
        int minLength = length;
        int start = 0;
        for (int i = 0; i < length; i++) {
            qwer[qwerToIndex(s.charAt(i))]--;
            if (isBalanced(qwer, balance)) {
                while (isBalanced(qwer, balance)) {
                    qwer[qwerToIndex(s.charAt(start))]++;
                    start++;
                }
                minLength = Math.min(minLength, i - start + 2);
            }
        }
        return minLength;
    }

    public boolean isBalanced(int[] qwer, int balance) {
        for (int num : qwer) {
            if (num > balance) {
                return false;
            }
        }
        return true;
    }

    public int qwerToIndex(char c) {
        switch (c) {
            case 'Q':
                return 0;
            case 'W':
                return 1;
            case 'E':
                return 2;
            case 'R':
                return 3;
            default:
                throw new IllegalArgumentException();
        }
    }

    public int balancedString1(String s) {
        char[] characters = {'Q', 'W', 'E', 'R'};
        short[] counts = new short[4];
        short expected = (short) (s.length() / 4);
        int result = 0;

        for (short i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'Q':
                    counts[0]++;
                    break;
                case 'W':
                    counts[1]++;
                    break;
                case 'E':
                    counts[2]++;
                    break;
                case 'R':
                    counts[3]++;
            }
        }

        char gap = ' ';
        while (counts[0] != counts[1] || counts[1] != counts[2]
                || counts[2] != counts[3] || counts[3] != expected) {
            for (short i = 0; i < counts.length; i++) {
                if (gap == ' ' && counts[i] < expected) {
                    gap = characters[i];
                    counts[i]++;
                    break;
                }

                if (gap != ' ' && counts[i] > expected) {
                    counts[i]--;
                    gap = ' ';
                    result++;
                    break;
                }
            }

        }

        return result;
    }

    public int balancedString11(String s) {
        int n = s.length();
        int[] qwer = new int[4];
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            cal(qwer, s.charAt(i), true);
        }

        for (int i = 0; i < 4; i++) {
            qwer[i] -= n / 4;
        }

        if (qwer[0] == 0 && qwer[1] == 0 && qwer[2] == 0 && qwer[3] == 0) {
            return 0;
        }

        for (int hi = 0, lo = 0; hi < n; hi++) {
            cal(qwer, s.charAt(hi), false);
            while (qwer[0] <= 0 && qwer[1] <= 0 && qwer[2] <= 0 && qwer[3] <= 0) {
                res = Math.min(res, hi - lo + 1);
                cal(qwer, s.charAt(lo++), true);
            }
        }
        return res;
    }

    private void cal(int[] qwer, char c, boolean inc) {
        int x = (inc) ? 1 : -1;
        if (c == 'Q') {
            qwer[0] += x;
        } else if (c == 'W') {
            qwer[1] += x;
        } else if (c == 'E') {
            qwer[2] += x;
        } else if (c == 'R') {
            qwer[3] += x;
        }
    }

}
