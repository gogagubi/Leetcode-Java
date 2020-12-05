package com.leetcode.example.string;

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
        int num = 0;

        for (int i = 0; i < J.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (J.charAt(i) == S.charAt(j)) {
                    num++;
                }
            }
        }

        return num;
    }

}

