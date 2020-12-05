package com.leetcode.example.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class _509_FibonacciNumber {
    public static void main(String[] args) {
        if (true) {
            _509_FibonacciNumber c = new _509_FibonacciNumber();

            int N = 5;
            System.out.println("Result = " + c.fib(N));
        }


    }

    public int fib(int N) {
        if (N == 0 || N == 1) {
            return N;
        }

        int a = 0, b = 1, sum = 0;
        N --;

        while (N > 0) {
            sum = a + b;
            a = b;
            b = sum;

            N--;
        }

        return sum;
    }


}
