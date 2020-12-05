package com.leetcode.example.recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _1137_NthTribonacciNumber {
    public static void main(String[] args) {
        //example 1
        if (true) {
            _1137_NthTribonacciNumber c = new _1137_NthTribonacciNumber();
            int n = 4;
            System.out.println("Result = " + c.tribonacci(n));
        }

        if (true) {
            _1137_NthTribonacciNumber c = new _1137_NthTribonacciNumber();
            int n = 25;
            System.out.println("Result = " + c.tribonacci(n));
        }

        if (true) {
            _1137_NthTribonacciNumber c = new _1137_NthTribonacciNumber();
            int n = 0;
            System.out.println("Result = " + c.tribonacci(n));
        }

        if (true) {
            _1137_NthTribonacciNumber c = new _1137_NthTribonacciNumber();
            int n = 1;
            System.out.println("Result = " + c.tribonacci(n));
        }

        if (true) {
            _1137_NthTribonacciNumber c = new _1137_NthTribonacciNumber();
            int n = 2;
            System.out.println("Result = " + c.tribonacci(n));
        }
    }

    public int tribonacci(int n) {
        int[] nums = {0, 1, 1};
        return rec(nums, n, 3);
    }

    public int rec(int[] nums, int n, int level) {
        if (n < level) return nums[n];

        int sum = 0;
        for (int i = 0; i < nums.length; i++) sum += nums[i];
        if (level == n) {
            return sum;
        }

        for (int i = 0; i < nums.length - 1; i++) nums[i] = nums[i + 1];
        nums[2] = sum;
        return rec(nums, n, level + 1);
    }

}
