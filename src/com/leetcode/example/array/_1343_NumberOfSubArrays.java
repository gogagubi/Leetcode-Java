package com.leetcode.example.array;


public class _1343_NumberOfSubArrays {
    public static void main(String[] args) {
        if (true) {
            _1343_NumberOfSubArrays c = new _1343_NumberOfSubArrays();

            int[] arr = {2, 2, 2, 2, 5, 5, 5, 8};
            int k = 3, threshold = 4;
            System.out.println("Sub arrays " + c.numOfSubarrays(arr, k, threshold));
        }

        if (true) {
            _1343_NumberOfSubArrays c = new _1343_NumberOfSubArrays();

            int[] arr = {1, 1, 1, 1, 1};
            int k = 1, threshold = 0;
            System.out.println("Sub arrays " + c.numOfSubarrays(arr, k, threshold));
        }

        if (true) {
            _1343_NumberOfSubArrays c = new _1343_NumberOfSubArrays();

            int[] arr = {11, 13, 17, 23, 29, 31, 7, 5, 2, 3};
            int k = 3, threshold = 5;
            System.out.println("Sub arrays " + c.numOfSubarrays(arr, k, threshold));
        }

        if (true) {
            _1343_NumberOfSubArrays c = new _1343_NumberOfSubArrays();

            int[] arr = {7, 7, 7, 7, 7, 7, 7};
            int k = 7, threshold = 7;
            System.out.println("Sub arrays " + c.numOfSubarrays(arr, k, threshold));
        }

        if (true) {
            _1343_NumberOfSubArrays c = new _1343_NumberOfSubArrays();

            int[] arr = {4, 4, 4, 4};
            int k = 4, threshold = 1;
            System.out.println("Sub arrays " + c.numOfSubarrays(arr, k, threshold));
        }
    }

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0, right = 0, sum = 0, result = 0;
        while (right < arr.length) {
            sum += arr[right];
            if (right - left + 1 == k) {
                if (sum / k >= threshold) {
                    result++;
                }

                sum -= arr[left];
                left++;
            }
            right++;
        }
        return result;
    }

}
