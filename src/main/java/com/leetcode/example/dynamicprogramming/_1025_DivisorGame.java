package com.leetcode.example.dynamicprogramming;


public class _1025_DivisorGame {
    public static void main(String[] args) {
        if (true) {
            _1025_DivisorGame c = new _1025_DivisorGame();
            int N = 2;

            System.out.println("Result " + c.divisorGame(N));
        }

        if (true) {
            _1025_DivisorGame c = new _1025_DivisorGame();
            int N = 3;

            System.out.println("Result " + c.divisorGame(N));
        }
    }

    public boolean divisorGame(int N) {
        if (N == 1) return false;

        boolean isAlice = true;
        int divisor = N - 1;
        while (N > 0) {
            if (N % divisor != 0) {
                divisor--;
                continue;
            }

            N -= divisor;
            isAlice = !isAlice;
        }

        return isAlice;
    }


}
