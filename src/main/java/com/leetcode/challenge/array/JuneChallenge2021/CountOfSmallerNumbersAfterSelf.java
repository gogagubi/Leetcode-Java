package com.leetcode.challenge.array.JuneChallenge2021;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

//2021-06-26
public class CountOfSmallerNumbersAfterSelf {

    @Test
    public void testCase1() {
        CountOfSmallerNumbersAfterSelf s = new CountOfSmallerNumbersAfterSelf();
        int[] nums = {5, 2, 6, 1};

        Assert.assertEquals(Arrays.asList(2, 1, 1, 0), s.countSmaller(nums));
    }

    @Test
    public void testCase2() {
        CountOfSmallerNumbersAfterSelf s = new CountOfSmallerNumbersAfterSelf();
        int[] nums = {-1};

        Assert.assertEquals(Arrays.asList(0), s.countSmaller(nums));
    }

    @Test
    public void testCase3() {
        CountOfSmallerNumbersAfterSelf s = new CountOfSmallerNumbersAfterSelf();
        int[] nums = {-1, -1};

        Assert.assertEquals(Arrays.asList(0, 0), s.countSmaller(nums));
    }

    @Test
    public void testCase4() {
        CountOfSmallerNumbersAfterSelf s = new CountOfSmallerNumbersAfterSelf();
        int[] nums = {2, 0, 1};

        Assert.assertEquals(Arrays.asList(2, 0, 0), s.countSmaller(nums));
    }

    class Pair {
        int index;
        int value;

        Pair(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

    public List<Integer> countSmaller(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Pair[] pairs = new Pair[nums.length];

        for (int i = 0; i < nums.length; i++) {
            pairs[i] = new Pair(i, nums[i]);
        }

        Map<Integer, Integer> counts = new HashMap<>();
        merge(pairs, counts);

        for (int i = 0; i < nums.length; i++) ans.add(counts.getOrDefault(i, 0));

        return ans;
    }

    public void merge(Pair[] arr, Map<Integer, Integer> counts) {
        if (arr.length <= 1)
            return;

        int mid = arr.length / 2;
        Pair[] leftArr = new Pair[mid];
        Pair[] rightArr = new Pair[arr.length - mid];

        for (int i = 0; i < arr.length; i++) {
            if (i < mid) leftArr[i] = arr[i];
            else rightArr[i - mid] = arr[i];
        }

        merge(leftArr, counts);
        merge(rightArr, counts);

        int i = 0, j = 0, k = 0;

        int rightCount = 0;
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i].value <= rightArr[j].value) {
                counts.put(leftArr[i].index, counts.getOrDefault(leftArr[i].index, 0) + rightCount);
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
                rightCount++;
            }
        }

        while (i < leftArr.length) {
            counts.put(leftArr[i].index, counts.getOrDefault(leftArr[i].index, 0) + rightCount);
            arr[k++] = leftArr[i++];
        }
        while (j < rightArr.length) arr[k++] = rightArr[j++];
    }

}
