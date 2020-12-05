package com.leetcode.example.string;


public class _394_DecodeString2 {
    public static void main(String[] args) {
        if (false) {
            _394_DecodeString2 c = new _394_DecodeString2();

            String s = "3[a]2[bc]";
            System.out.println("Addition result = " + c.decodeString(s));
        }

        if (true) {
            _394_DecodeString2 c = new _394_DecodeString2();

            String s = "3[a2[c]]";
            System.out.println("Addition result = " + c.decodeString(s));
        }

        if (false) {
            _394_DecodeString2 c = new _394_DecodeString2();

            String s = "2[abc]3[cd]ef";
            System.out.println("Addition result = " + c.decodeString(s));
        }
    }

    public String decodeString(String s) {
        return "";
    }

    String result = "";

    public String decodeStringRec(String s, int ignoreFrom, int ingnoreTo) {
        StringBuilder decoded = new StringBuilder();
        int openBrace = 0;
        int closeBrace = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                decoded = new StringBuilder();
                openBrace = i;
            } else if (s.charAt(i) == ']') {
                closeBrace = i;

                result = decoded.toString();
                decodeStringRec(s, openBrace, closeBrace);
                break;
            }
            else if(Character.isDigit(s.charAt(i))){
                int count = s.charAt(i) - '0';
                for(int j = 0; j < count; j ++){

                }
            }
            else {
                decoded.append(s.charAt(i));
            }
        }

        return decoded.toString();
    }

}
