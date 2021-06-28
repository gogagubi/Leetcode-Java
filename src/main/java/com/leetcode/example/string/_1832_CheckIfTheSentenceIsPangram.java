package com.leetcode.example.string;

public class _1832_CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        if (true) {
            _1832_CheckIfTheSentenceIsPangram o = new _1832_CheckIfTheSentenceIsPangram();
            String sentence = "thequickbrownfoxjumpsoverthelazydog";

            System.out.println(o.checkIfPangram(sentence));
        }

        if (true) {
            _1832_CheckIfTheSentenceIsPangram o = new _1832_CheckIfTheSentenceIsPangram();
            String sentence = "leetcode";

            System.out.println(o.checkIfPangram(sentence));
        }
    }

    public boolean checkIfPangram(String sentence) {
        int[] alpha = new int[26];
        for (char c : sentence.toCharArray()) alpha[c - 'a']++;
        for(int i: alpha){
            if(i == 0) return false;
        }

        return true;
    }


}
