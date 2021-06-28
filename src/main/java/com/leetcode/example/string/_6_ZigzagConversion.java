package com.leetcode.example.string;


public class _6_ZigzagConversion {
    public static void main(String[] args) {
        if (true) {
            _6_ZigzagConversion c = new _6_ZigzagConversion();

            String s = "PAYPALISHIRING";
            int numRows = 3;
            System.out.println("Converted " + c.convert(s, numRows));
        }

        if (true) {
            _6_ZigzagConversion c = new _6_ZigzagConversion();

            String s = "PAYPALISHIRING";
            int numRows = 4;
            System.out.println("Converted " + c.convert(s, numRows));
        }

        if (true) {
            _6_ZigzagConversion c = new _6_ZigzagConversion();

            String s = "AB";
            int numRows = 1;
            System.out.println("Converted " + c.convert(s, numRows));
        }
        if (true) {
            _6_ZigzagConversion c = new _6_ZigzagConversion();

            String s = "ABC";
            int numRows = 1;
            System.out.println("Converted " + c.convert(s, numRows));
        }
    }

    public String convert(String s, int numRows) {
        int operation = 1, index = 0, rowIndex = 0;
        StringBuilder[] arr = new StringBuilder[numRows];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new StringBuilder();
        }

        while (index < s.length()) {
            arr[rowIndex].append(s.charAt(index));

            if (rowIndex + operation >= 0 && rowIndex + operation < arr.length) {
                rowIndex += operation;
            }

            index++;
            if (rowIndex == 0) operation = 1;
            if (rowIndex == numRows - 1) operation = -1;
        }

        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]);
        }

        return result.toString();
    }

}
