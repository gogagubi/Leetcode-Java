package com.leetcode.example.string;


public class _557_ReverseStringIII {
    public static void main(String[] args) {
        if (true) {
            _557_ReverseStringIII c = new _557_ReverseStringIII();

            String s = "Let's take LeetCode contest";
            int k = 2;
            System.out.println("Reversed string " + c.reverseWords(s));
        }

    }


    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int length = arr.length;
        int current = 0, pinpoint = 0;

        int left = 0;
        int right = 0;
        while (current < length) {
            current++;
            if (current == length || arr[current] == ' ') {
                left = pinpoint;
                right = current - 1;
                pinpoint = current + 1;
            }

            while (left < right) {
                char tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
        }

        return new String(arr, 0, length);
    }

}
