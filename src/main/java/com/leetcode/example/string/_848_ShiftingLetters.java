package com.leetcode.example.string;

public class _848_ShiftingLetters {
    public static void main(String[] args) {
        if (true) {
            _848_ShiftingLetters o = new _848_ShiftingLetters();
            String S = "abc";
            int[] shifts = {3, 5, 9};

            System.out.println("Result " + o.shiftingLetters(S, shifts));
        }

        if (true) {
            _848_ShiftingLetters o = new _848_ShiftingLetters();
            String S = "bad";
            int[] shifts = {10, 20, 30};

            System.out.println("Result " + o.shiftingLetters(S, shifts));
        }

        if (true) {
            _848_ShiftingLetters o = new _848_ShiftingLetters();
            String S = "mkgfzkkuxownxvfvxasy";
            int[] shifts = {505870226, 437526072, 266740649, 224336793, 532917782, 311122363, 567754492, 595798950, 81520022, 684110326, 137742843, 275267355, 856903962, 148291585, 919054234, 467541837, 622939912, 116899933, 983296461, 536563513};

            System.out.println("Result " + o.shiftingLetters(S, shifts)); //"wqqwlcjnkphhsyvrkdod"
        }
    }


    public String shiftingLetters(String S, int[] shifts) {
        StringBuilder ans = new StringBuilder();

        for (int i = shifts.length - 2; i >= 0; i--) {
            shifts[i] = (shifts[i] + shifts[i + 1]) % 26;
        }

        for (int i = 0; i < shifts.length; i++) {
            char curr = S.charAt(i);
            int code = curr - 'a';

            int shiftResult = (code + shifts[i]) % 26;
            char shiftedChar = (char) (shiftResult + 'a');
            ans.append(shiftedChar);
        }

        return ans.toString();
    }

}
