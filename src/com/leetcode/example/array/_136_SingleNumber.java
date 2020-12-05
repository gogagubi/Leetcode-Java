package com.leetcode.example.array;

public class _136_SingleNumber {
    public static void main(String[] args) {
        if (true) {
            _136_SingleNumber c = new _136_SingleNumber();
            int[] arr = {2, 2, 1};
            System.out.println("Single element = " + c.singleNumber(arr));
        }

        if (true) {
            _136_SingleNumber c = new _136_SingleNumber();
            int[] arr = {4, 1, 2, 1, 2};
            System.out.println("Single element = " + c.singleNumber(arr));
        }
    }


    public int singleNumber(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num = num ^ nums[i];
        }

        return num;
    }

}

