package com.leetcode.example.string;


public class _541_ReverseStringII {
    public static void main(String[] args) {
        if (true) {
            _541_ReverseStringII c = new _541_ReverseStringII();

            String s = "abcdefg";
            int k = 2;
            System.out.println("Reversed string " + c.reverseStr(s, k));
        }


        if (true) {
            _541_ReverseStringII c = new _541_ReverseStringII();

            String s = "abcdefg";
            int k = 8;
            System.out.println("Reversed string " + c.reverseStr(s, k));
        }


        if (true) {
            _541_ReverseStringII c = new _541_ReverseStringII();

            String s = "hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl";
            int k = 39;
            System.out.println("Reversed string " + c.reverseStr(s, k));
        }
    }


    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();

        for (int firstIndex = 0; firstIndex < s.length(); firstIndex += 2 * k) {
            int left = firstIndex;
            int right = Math.min(left + (k - 1), s.length() - 1);

            while (left < right) {
                char tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;

                left++;
                right--;
            }
        }

        return new String(arr, 0, arr.length);
    }

}
