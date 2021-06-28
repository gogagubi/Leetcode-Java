package com.leetcode.example.number;

import java.util.HashSet;

public class _202_HappyNumber {
    public static void main(String[] args) {
        //example 1
        if (true) {
            _202_HappyNumber c = new _202_HappyNumber();
            int x = 19;
            System.out.println("Is Happy = " + c.isHappy(x));
        }

        //example 1
        if (true) {
            _202_HappyNumber c = new _202_HappyNumber();
            int x = 12;
            System.out.println("Is Happy = " + c.isHappy(x));
        }
    }

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (n != 1) {
            int sum = 0;
            int current = n;

            while (current != 0) {
                int reminder = current % 10;
                sum += reminder * reminder;
                current /= 10;
            }

            if (set.contains(sum)) {
                return false;
            }

            set.add(sum);
            n = sum;
        }

        return true;
    }

}

