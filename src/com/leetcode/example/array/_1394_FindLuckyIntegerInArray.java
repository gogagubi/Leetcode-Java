package com.leetcode.example.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _1394_FindLuckyIntegerInArray {
    public static void main(String[] args) {
        //example 1
        if (true) {
            _1394_FindLuckyIntegerInArray c = new _1394_FindLuckyIntegerInArray();
            int[] nums = {2, 2, 3, 4};
            System.out.println("Lucky  number = " + c.findLucky(nums));
        }

        //example 2
        if (true) {
            _1394_FindLuckyIntegerInArray c = new _1394_FindLuckyIntegerInArray();
            int[] nums = {1, 2, 2, 3, 3, 3};
            System.out.println("Lucky  number = " + c.findLucky(nums));
        }

        //example 3
        if (true) {
            _1394_FindLuckyIntegerInArray c = new _1394_FindLuckyIntegerInArray();
            int[] nums = {2, 2, 2, 3, 3};
            System.out.println("Lucky  number = " + c.findLucky(nums));
        }

        //example 4
        if (true) {
            _1394_FindLuckyIntegerInArray c = new _1394_FindLuckyIntegerInArray();
            int[] nums = {5};
            System.out.println("Lucky  number = " + c.findLucky(nums));
        }

        //example 5
        if (true) {
            _1394_FindLuckyIntegerInArray c = new _1394_FindLuckyIntegerInArray();
            int[] nums = {7, 7, 7, 7, 7, 7, 7};
            System.out.println("Lucky  number = " + c.findLucky(nums));
        }

        //example 6
        if (false) {
            _1394_FindLuckyIntegerInArray c = new _1394_FindLuckyIntegerInArray();
            int[] nums = {4, 3, 2, 2, 4, 1, 3, 4, 3};
            System.out.println("Lucky  number = " + c.findLucky(nums));
        }
    }


    public int findLucky(int[] arr) {
        int lucky = -1;
        if (arr.length == 0) {
            return lucky;
        }

        Arrays.sort(arr);

        int left = 0;
        int right = 0;

        int counter = 0;
        int prevElement = arr[right];
        while (right < arr.length) {
            if (arr[left] == arr[right]) {
                counter++;
            }

            if (prevElement != arr[right] || right == arr.length - 1) {
                if (counter == arr[left]) {
                    lucky = arr[left];
                }

                left = right;
                counter = 0;

                if (right == arr.length - 1) {
                    break;
                }
            } else {
                right++;
            }

            prevElement = arr[left];
        }


        return lucky;
    }


    public int findLuckyV1(int[] arr) {
        int lucky = -1;
        if (arr.length == 0) {
            return lucky;
        }

        Set<Integer> set = new HashSet<>();
        int counter;

        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                counter = 0;
                for (int j = i; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        counter++;
                    }
                }

                if (counter == arr[i]) {
                    lucky = Math.max(lucky, arr[i]);
                }
            }
        }

        return lucky;
    }

}
