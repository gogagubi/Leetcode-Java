package com.leetcode.example.math;

import java.util.HashMap;
import java.util.Map;

public class _168_ExcelSheetColumnTitle {
    public static void main(String[] args) {
        if (true) {
            _168_ExcelSheetColumnTitle c = new _168_ExcelSheetColumnTitle();
            int n = 1;

            System.out.println("Result " + c.convertToTitle(n));
        }

        if (true) {
            _168_ExcelSheetColumnTitle c = new _168_ExcelSheetColumnTitle();
            int n = 28;

            System.out.println("Result " + c.convertToTitle(n));
        }

        if (true) {
            _168_ExcelSheetColumnTitle c = new _168_ExcelSheetColumnTitle();
            int n = 700;

            System.out.println("Result " + c.convertToTitle(n));
        }
    }

    public String convertToTitle(int n) {
        StringBuilder builder = new StringBuilder();
        char[] letters = new char[26];

        for(char i = 'A'; i <= 'Z'; i ++){
            letters[i - 'A'] = i;
        }

        while(n > 0){
            n --;
            builder.append(letters[n % 26]);
            n /= 26;
        }

        return builder.reverse().toString();
    }
}
