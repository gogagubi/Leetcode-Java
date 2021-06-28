package com.leetcode.challenge.array.JuneChallenge2021;

//2021-06-18
public class RangeSumQueryMutable_OLD {

    public static void main(String[] args) {
        RangeSumQueryMutable_OLD o = new RangeSumQueryMutable_OLD();
        o.start();
    }


    public void start() {
        if (true) {
            NumArray numArray = new NumArray(new int[]{1, 3, 5});
            numArray.sumRange(0, 2);
            numArray.update(1, 2);
            numArray.sumRange(0, 2);
        }
    }


    class NumArray {
        private int[] nums;
        private int[] cache;

        public NumArray(int[] nums) {
            this.nums = nums;
            cache = new int[nums.length + 1];

            for (int i = 0; i < nums.length; i++) {
                cache[i + 1] = cache[i] + nums[i];
            }
        }

        public void update(int index, int val) {
            nums[index] = val;

            for (int i = index; i < nums.length; i++) {
                cache[i + 1] = cache[i] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            return cache[right + 1] - cache[left];
        }
    }


}
