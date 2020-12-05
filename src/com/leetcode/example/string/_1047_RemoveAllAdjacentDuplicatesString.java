package com.leetcode.example.string;

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
        int pointer = 0;

        for (int i = 0; i < S.length(); i++) {
            char current = S.charAt(i);

            if (pointer > 0 && arr[pointer - 1] == current) {
                pointer--;
            } else {
                arr[pointer] = current;
                pointer++;
            }
        }

        return new String(arr, 0, pointer);
    }

}
