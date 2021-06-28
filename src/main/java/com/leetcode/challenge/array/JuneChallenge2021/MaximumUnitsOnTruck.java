package com.leetcode.challenge.array.JuneChallenge2021;

import org.junit.Test;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

import static org.junit.Assert.assertEquals;

//2021-06-14
public class MaximumUnitsOnTruck {

    @Test
    public void testCase1() {
        MaximumUnitsOnTruck c = new MaximumUnitsOnTruck();
        int[][] boxTypes = {{1, 3}, {2, 2}, {3, 1}};
        int truckSize = 4;

        assertEquals(8, c.maximumUnits(boxTypes, truckSize));
    }

    @Test
    public void testCase2() {
        MaximumUnitsOnTruck c = new MaximumUnitsOnTruck();
        int[][] boxTypes = {{5, 10}, {2, 5}, {4, 7}, {3, 9}};
        int truckSize = 10;

        assertEquals(91, c.maximumUnits(boxTypes, truckSize));
    }

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int ans = 0;

        Arrays.sort(boxTypes, (int a[], int b[]) -> b[1] - a[1]);
        for(int[] i: boxTypes){
            int numberOfBoxes = i[0];
            int unitsOfBoxes = i[1];

            int canCarry = Math.min(numberOfBoxes, truckSize);
            ans += canCarry * unitsOfBoxes;
            truckSize -= canCarry;
        }

        return ans;
    }

}
