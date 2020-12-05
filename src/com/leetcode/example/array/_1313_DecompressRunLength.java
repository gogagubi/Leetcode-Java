package com.leetcode.example.array;

import java.util.Arrays;

public class _1313_DecompressRunLength {
    public static void main(String[] args) {
        if (true) {
            _1313_DecompressRunLength c = new _1313_DecompressRunLength();
            int[] nums = {1, 2, 3, 4};
            System.out.println("Decompressed list = " + Arrays.toString(c.decompressRLElist(nums)));
        }

        if (true) {
            _1313_DecompressRunLength c = new _1313_DecompressRunLength();
            int[] nums = {1, 1, 2, 3};
            System.out.println("Decompressed list = " + Arrays.toString(c.decompressRLElist(nums)));
        }
    }

    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for(int i = 0; i < nums.length; i += 2){
            size += nums[i];
        }
        int[] decompressed = new int[size];

        int index = 0;
        for(int i = 0; i < nums.length; i += 2){
            for(int j = 0; j < nums[i]; j ++){
                decompressed[index ++] = nums[i + 1];
            }
        }

        return decompressed;
    }

}

