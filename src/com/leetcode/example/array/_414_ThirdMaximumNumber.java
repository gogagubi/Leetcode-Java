package com.leetcode.example.array;

public class _414_ThirdMaximumNumber {
    public static void main(String[] args) {
        if (true) {
            _414_ThirdMaximumNumber c = new _414_ThirdMaximumNumber();
            int[] arr = {3, 2, 1};
            System.out.println("Third max = " + c.thirdMax(arr));
        }

        if (true) {
            _414_ThirdMaximumNumber c = new _414_ThirdMaximumNumber();
            int[] arr = {1, 2};
            System.out.println("Third max = " + c.thirdMax(arr));
        }

        if (true) {
            _414_ThirdMaximumNumber c = new _414_ThirdMaximumNumber();
            int[] arr = {2, 2, 3, 1};
            System.out.println("Third max = " + c.thirdMax(arr));
        }

        if (true) {
            _414_ThirdMaximumNumber c = new _414_ThirdMaximumNumber();
            int[] arr = {1};
            System.out.println("Third max = " + c.thirdMax(arr));
        }

        if (true) {
            _414_ThirdMaximumNumber c = new _414_ThirdMaximumNumber();
            int[] arr = {5, 2, 2};
            System.out.println("Third max = " + c.thirdMax(arr));
        }

        if (true) {
            _414_ThirdMaximumNumber c = new _414_ThirdMaximumNumber();
            int[] arr = {1, 2, -2147483648};
            System.out.println("Third max = " + c.thirdMax(arr));
        }

        if (true) {
            _414_ThirdMaximumNumber c = new _414_ThirdMaximumNumber();
            int[] arr = {1, 1, 1};
            System.out.println("Third max = " + c.thirdMax(arr));
        }

        if (true) {
            _414_ThirdMaximumNumber c = new _414_ThirdMaximumNumber();
            int[] arr = {5, Integer.MAX_VALUE, 3, 7, 4, 1};
            System.out.println("Third max = " + c.thirdMax(arr));
        }
    }

    public int thirdMax(int[] nums) {
        int result = 0;
        if (nums.length == 0) {
            return result;
        }

        Long[] arr = {Long.MAX_VALUE, null, null, null};

        out:
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (arr[i - 1] == null) break out;
                if ((arr[i] == null || nums[j] > arr[i]) && nums[j] < arr[i - 1]) {
                    arr[i] = (long) nums[j];
                }
            }
        }

        return new Long(arr[3] != null ? arr[3] : arr[1]).intValue();
    }

}
