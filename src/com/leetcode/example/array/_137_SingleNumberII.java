package com.leetcode.example.array;

import java.util.HashMap;

public class _137_SingleNumberII {
    public static void main(String[] args) {
        //example 1
        if (true) {
            _137_SingleNumberII c = new _137_SingleNumberII();
            int[] nums = {2, 2, 3, 2};
            System.out.println("Single element = " + c.singleNumber(nums));
        }

        //example 2
        if (true) {
            _137_SingleNumberII c = new _137_SingleNumberII();
            int[] nums = {0, 1, 0, 1, 0, 1, 99};
            System.out.println("Single element = " + c.singleNumber(nums));
        }

    }

    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }

        return -1;
    }
}
