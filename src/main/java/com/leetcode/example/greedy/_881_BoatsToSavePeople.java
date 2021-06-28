package com.leetcode.example.greedy;

import java.util.Arrays;

public class _881_BoatsToSavePeople {
    public static void main(String[] args) {
        if (true) {
            _881_BoatsToSavePeople c = new _881_BoatsToSavePeople();

            int[] people = {1, 2};
            int limit = 3;
            System.out.println(c.numRescueBoats(people, limit));
        }

        if (true) {
            _881_BoatsToSavePeople c = new _881_BoatsToSavePeople();

            int[] people = {3, 2, 2, 1};
            int limit = 3;
            System.out.println(c.numRescueBoats(people, limit));
        }

        if (true) {
            _881_BoatsToSavePeople c = new _881_BoatsToSavePeople();

            int[] people = {3, 5, 3, 4};
            int limit = 5;
            System.out.println(c.numRescueBoats(people, limit));
        }

        if (true) {
            _881_BoatsToSavePeople c = new _881_BoatsToSavePeople();

            int[] people = {5, 1, 4, 2};
            int limit = 6;
            System.out.println(c.numRescueBoats(people, limit));
        }

    }

    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int ans = 0;
        int i = 0, j = people.length - 1;

        while (i <= j) {
            ans += 1;

            if (people[i] + people[j] <= limit) i++;
            j--;
        }

        return ans;
    }

}
