package com.leetcode.example.math;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _13_Roman_to_Integer {
    public static void main(String[] args) {
        if (true) {
            _13_Roman_to_Integer c = new _13_Roman_to_Integer();
            String s = "III";

            System.out.println("Result " + c.romanToInt(s));
        }

        if (true) {
            _13_Roman_to_Integer c = new _13_Roman_to_Integer();
            String s = "IV";

            System.out.println("Result " + c.romanToInt(s));
        }

        if (true) {
            _13_Roman_to_Integer c = new _13_Roman_to_Integer();
            String s = "IX";

            System.out.println("Result " + c.romanToInt(s));
        }

        if (true) {
            _13_Roman_to_Integer c = new _13_Roman_to_Integer();
            String s = "LVIII";

            System.out.println("Result " + c.romanToInt(s));
        }

        if (true) {
            _13_Roman_to_Integer c = new _13_Roman_to_Integer();
            String s = "MCMXCIV";

            System.out.println("Result " + c.romanToInt(s));
        }
    }

    public int romanToInt(String s) {
        Map<Character, Integer> map = getMap();
        int sum = 0;
        char curr, next;

        for(int i = 0; i < s.length(); i ++){
            curr = s.charAt(i);
            next = i < s.length() - 1 ? s.charAt(i + 1) : ' ';

            if(next != ' ' && map.get(curr) < map.get(next)){
                sum += (map.get(curr) * -1);
            }
            else{
                sum += map.get(curr);
            }
        }

        return sum;
    }


    public Map<Character, Integer> getMap(){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        return map;
    }
}
