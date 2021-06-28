package com.leetcode.example.array;


import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class _1408_StringMatchInArray {
    public static void main(String[] args) {
        if (true) {
            _1408_StringMatchInArray c = new _1408_StringMatchInArray();

            String[] words = {"mass", "as", "hero", "superhero"};
            System.out.println("Strings matched" + c.stringMatching(words));
        }

        if (true) {
            _1408_StringMatchInArray c = new _1408_StringMatchInArray();

            String[] words = {"leetcode", "et", "code"};
            System.out.println("Strings matched" + c.stringMatching(words));
        }

        if (true) {
            _1408_StringMatchInArray c = new _1408_StringMatchInArray();

            String[] words = {"blue", "green", "bu"};
            System.out.println("Strings matched" + c.stringMatching(words));
        }

        if (true) {
            _1408_StringMatchInArray c = new _1408_StringMatchInArray();

            String[] words = {"leetcoder", "leetcode", "od", "hamlet", "am"};
            System.out.println("Strings matched " + c.stringMatching(words));
        }
    }

    public List<String> stringMatching(String[] words) {
        int length = words.length;
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (words[i].length() > words[j].length() && words[i].contains(words[j])) {
                    set.add(words[j]);
                } else if (words[j].length() > words[i].length() && words[j].contains(words[i])) {
                    set.add(words[i]);
                }
            }
        }

        return set.stream().collect(Collectors.toList());
    }

}
