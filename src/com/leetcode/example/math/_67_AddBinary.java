package com.leetcode.example.math;

public class _67_AddBinary {
    public static void main(String[] args) {
        if (true) {
            _67_AddBinary c = new _67_AddBinary();

            String a = "11";
            String b = "1";
            System.out.println("Binary addition result = " + c.addBinary(a, b));
        }

        if (true) {
            _67_AddBinary c = new _67_AddBinary();

            String a = "1010";
            String b = "1011";
            System.out.println("Binary addition result = " + c.addBinary(a, b));
        }

        if (true) {
            _67_AddBinary c = new _67_AddBinary();

            String a = "1111";
            String b = "1111";
            System.out.println("Binary addition result = " + c.addBinary(a, b));
        }
    }


    public String addBinary(String a, String b) {
        String result = "";

        int i = a.length() - 1, j = b.length() - 1, reminder = 0;
        while (i >= 0 || j >= 0 || reminder == 1) {
            int num = 0;

            if (i >= 0) {
                num += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                num += b.charAt(j) - '0';
                j--;
            }

            num += reminder;

            result = (char) (num % 2 + '0') + result;
            reminder = num / 2;
        }

        return result;
    }

}
