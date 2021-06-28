package com.leetcode.example.string;


public class _415_AddStrings {
    public static void main(String[] args) {
        if (true) {
            _415_AddStrings c = new _415_AddStrings();

            String num1 = "27";
            String num2 = "86";
            System.out.println("Addition result = " + c.addStrings(num1, num2));
        }
    }

    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder result = new StringBuilder();
        int reminder = 0;

        while (i >= 0 || j >= 0 || reminder > 0) {
            int calc = 0;

            if (i >= 0) {
                calc += num1.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                calc += num2.charAt(j) - '0';
                j--;
            }

            calc += reminder;

            result.insert(0, (char) ((calc % 10) + '0'));
            reminder = calc / 10;
        }

        return result.toString();
    }

}
