package com.leetcode.example.hash_table;

import java.util.HashSet;
import java.util.Set;

public class _771_JewelsAndStones {
    public static void main(String[] args) {
        if (true) {
            _771_JewelsAndStones c = new _771_JewelsAndStones();
            String J = "aA";
            String S = "aAAbbbb";
            System.out.println("Num of jewels = " + c.numJewelsInStones(J, S));
        }

        if (true) {
            _771_JewelsAndStones c = new _771_JewelsAndStones();
            String J = "z";
            String S = "ZZ";
            System.out.println("Num of jewels = " + c.numJewelsInStones(J, S));
        }
    }

    public int numJewelsInStones(String J, String S) {
        int ans = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < J.length(); i++) set.add(J.charAt(i));

        for (int i = 0; i < S.length(); i++) {
            if (set.contains(S.charAt(i))) ans++;
        }

        return ans;
    }

}

