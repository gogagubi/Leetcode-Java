package com.leetcode.challenge.array.JuneChallenge2021;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

//2021-06-27
public class Candy {

    @Test
    public void testCase1() {
        Candy s = new Candy();
        int[] ratings = {1, 0, 2};

        Assert.assertEquals(5, s.candy(ratings));
    }

    @Test
    public void testCase2() {
        Candy s = new Candy();
        int[] ratings = {1, 2, 2};

        Assert.assertEquals(4, s.candy(ratings));
    }

    @Test
    public void testCase3() {
        Candy s = new Candy();
        int[] ratings = {3, 2, 1};

        Assert.assertEquals(6, s.candy(ratings));
    }

    @Test
    public void testCase4() {
        Candy s = new Candy();
        int[] ratings = {29, 51, 87, 87, 72, 12};

        Assert.assertEquals(12, s.candy(ratings));
    }

    public int candy(int[] ratings) {
        int ans = 0;

        Integer[] indexes = new Integer[ratings.length];
        for (int i = 0; i < ratings.length; i++) indexes[i] = i;
        Arrays.sort(indexes, (a, b) -> ratings[a] - ratings[b]);

        int[] candies = new int[ratings.length];

        for (int i = 0; i < indexes.length; i++) {
            int maxCandy = 1;

            if (indexes[i] > 0 && ratings[indexes[i]] > ratings[indexes[i] - 1]) {
                maxCandy = Math.max(maxCandy, candies[indexes[i] - 1] + 1);
            }
            if (indexes[i] < ratings.length - 1 && ratings[indexes[i]] > ratings[indexes[i] + 1]) {
                maxCandy = Math.max(maxCandy, candies[indexes[i] + 1] + 1);
            }

            candies[indexes[i]] = maxCandy;
        }

        for (int i : candies) ans += i;
        return ans;
    }

}
