package com.leetcode.example.string;


import java.util.HashSet;

public class _1370_IncreasingDecreasingString {
    public static void main(String[] args) {
        if (true) {
            _1370_IncreasingDecreasingString c = new _1370_IncreasingDecreasingString();

            String s = "aaaabbbbcccc";
            System.out.println("Reversed string " + c.sortString(s));
        }

    }

    public String sortString(String s) {
        int[] alphabets = new int[26];
        StringBuilder result = new StringBuilder();

        for (short i = 0; i < s.length(); i++) {
            alphabets[s.charAt(i) - 'a']++;
        }

        while (result.length() != s.length()) {
            for (int i = 0; i < alphabets.length; i++) {
                if (alphabets[i] > 0) {
                    result.append((char) ('a' + i));
                    alphabets[i]--;
                }
            }
            for (int i = alphabets.length - 1; i >= 0; i--) {
                if (alphabets[i] > 0) {
                    result.append((char) ('a' + i));
                    alphabets[i]--;
                }
            }
        }

        return result.toString();
    }

    public String sortString1(String s) {
        short length = (short) s.length();
        HashSet<Short> indexes = new HashSet<>();
        char[] result = new char[length];
        short index = 0;

        while (indexes.size() != length) {
            char prevLess = 'a' - 1;
            while (true) {
                char min = 'z' + 1;
                short minIndex = -1;
                for (short i = 0; i < length; i++) {
                    if (!indexes.contains(i)) {
                        if (s.charAt(i) > prevLess && s.charAt(i) < min) {
                            min = s.charAt(i);
                            minIndex = i;
                        }
                    }
                }

                if (minIndex == -1) {
                    break;
                }

                indexes.add(minIndex);
                result[index++] = s.charAt(minIndex);
                prevLess = s.charAt(minIndex);
            }

            char prevGreather = 'z' + 1;
            while (true) {
                char max = 'a' - 1;
                short maxIndex = -1;
                for (short i = 0; i < length; i++) {
                    if (!indexes.contains(i)) {
                        if (s.charAt(i) < prevGreather && s.charAt(i) > max) {
                            max = s.charAt(i);
                            maxIndex = i;
                        }
                    }
                }

                if (maxIndex == -1) {
                    break;
                }

                indexes.add(maxIndex);
                result[index++] = s.charAt(maxIndex);
                prevGreather = s.charAt(maxIndex);
            }
        }


        return new String(result, 0, length);
    }

}
