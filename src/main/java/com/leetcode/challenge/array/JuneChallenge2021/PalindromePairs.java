package com.leetcode.challenge.array.JuneChallenge2021;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

//2021-06-13
public class PalindromePairs {

    @Test
    public void testCase1() {
        PalindromePairs c = new PalindromePairs();
        String[] words = {"abcd", "dcba", "lls", "s", "sssll"};

        assertEquals(Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(1, 0),
                Arrays.asList(3, 2),
                Arrays.asList(2, 4)
        ), c.palindromePairs(words));
    }

    @Test
    public void testCase2() {
        PalindromePairs c = new PalindromePairs();
        String[] words = {"bat", "tab", "cat"};

        assertEquals(Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(1, 0)
        ), c.palindromePairs(words));
    }

    @Test
    public void testCase3() {
        PalindromePairs c = new PalindromePairs();
        String[] words = {"a", ""};

        assertEquals(Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(1, 0)
        ), c.palindromePairs(words));
    }

    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> ans = new ArrayList<>();

        //Generate Map
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) map.put(words[i], i);

        //Case 1 - Blank Case
        if (map.containsKey("")) {
            Integer emptyStrIndex = map.get("");
            for (int i = 0; i < words.length; i++) {
                if (emptyStrIndex != i && isPalindrome(words[i])) {
                    ans.add(Arrays.asList(i, emptyStrIndex));
                    ans.add(Arrays.asList(emptyStrIndex, i));
                }
            }
        }

        //Case 2 - Reflection Case
        for (int i = 0; i < words.length; i++) {
            String reversed = new StringBuilder(words[i]).reverse().toString();
            if (map.containsKey(reversed)) {
                int reversedIndex = map.get(reversed);
                if (reversedIndex != i) {
                    ans.add(Arrays.asList(i, reversedIndex));
                }
            }
        }

        //Case 3 - Part Case
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 1; j < word.length(); j++) {
                String left = word.substring(0, j);
                String right = word.substring(j);

                if(isPalindrome(left)){
                    Integer foundIndex = map.get(new StringBuilder(right).reverse().toString());
                    if(foundIndex != null){
                        ans.add(Arrays.asList(foundIndex, i));
                    }
                }

                if(isPalindrome(right)){
                    Integer foundIndex = map.get(new StringBuilder(left).reverse().toString());
                    if(foundIndex != null){
                        ans.add(Arrays.asList(i, foundIndex));
                    }
                }
            }
        }

        return ans;
    }

    private boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i <= j) if (str.charAt(i++) != str.charAt(j--)) return false;
        return true;
    }
}
