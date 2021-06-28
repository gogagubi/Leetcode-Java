package com.leetcode.example.two_pointers;

public class _1047_RemoveAllAdjacentDuplicatesString {
    public static void main(String[] args) {
        if (true) {
            _1047_RemoveAllAdjacentDuplicatesString c = new _1047_RemoveAllAdjacentDuplicatesString();

            String S = "abbaca";
            System.out.println("Removed string = " + c.removeDuplicates(S));
        }
    }

    public String removeDuplicates(String S) {
        char[] arr = new char[S.length()];
        int j = 0;

        for (int i = 0; i < S.length(); i++) {
            char current = S.charAt(i);

            if (j > 0 && arr[j - 1] == current) {
                j--;
            } else {
                arr[j] = current;
                j++;
            }
        }

        return new String(arr, 0, j);
    }

}
