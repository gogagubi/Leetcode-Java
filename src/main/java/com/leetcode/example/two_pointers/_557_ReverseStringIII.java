package com.leetcode.example.two_pointers;


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
        int n = arr.length;

        int l = 0;
        int r = 0;
        while (r < n) {
            while (r < n && arr[r] != ' ') {
                r += 1;
            }

            int k = r - 1;
            while (l < k) {
                char tmp = arr[l];
                arr[l] = arr[k];
                arr[k] = tmp;
                l++;
                k--;
            }

            r += 1;
            l = r;
        }

        return new String(arr, 0, n);
    }

}
