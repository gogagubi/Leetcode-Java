package com.leetcode.example.array;

public class _1295_FindNumbersWithEvenNumberDigits {
    public static void main(String[] args) {
        if (true) {
            _1295_FindNumbersWithEvenNumberDigits c = new _1295_FindNumbersWithEvenNumberDigits();
            int[] nums = {12, 345, 2, 6, 7896};
            System.out.println("Even numbers = " + c.findNumbers(nums));
        }

        if (true) {
            _1295_FindNumbersWithEvenNumberDigits c = new _1295_FindNumbersWithEvenNumberDigits();
            int[] nums = {555, 901, 482, 1771};
            System.out.println("Even numbers = " + c.findNumbers(nums));
        }
    }

    public int findNumbers(int[] nums) {
        int num = 0;

        for (int current : nums) {
            int length = 0;
            while (current != 0) {
                current /= 10;
                length++;
            }

            if ((length & 1) == 0) {
                num++;
            }
        }

        return num;
    }

}

