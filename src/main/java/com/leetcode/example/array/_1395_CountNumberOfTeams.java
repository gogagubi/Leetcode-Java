package com.leetcode.example.array;

public class _1395_CountNumberOfTeams {
    public static void main(String[] args) {
        //example 1
        if (true) {
            _1395_CountNumberOfTeams c = new _1395_CountNumberOfTeams();
            int[] nums = {2, 5, 3, 4, 1};
            System.out.println("Number of teams = " + c.numTeams(nums));
        }

        //example 2
        if (true) {
            _1395_CountNumberOfTeams c = new _1395_CountNumberOfTeams();
            int[] nums = {2, 1, 3};
            System.out.println("Number of teams = " + c.numTeams(nums));
        }

        //example 3
        if (true) {
            _1395_CountNumberOfTeams c = new _1395_CountNumberOfTeams();
            int[] nums = {1, 2, 3, 4};
            System.out.println("Number of teams = " + c.numTeams(nums));
        }

    }


    public int numTeams(int[] rating) {
        int numOfTeams = 0;
        if (rating.length < 3) {
            return numOfTeams;
        }

        int left = 0;
        int middle = left + 1;
        int right = middle + 1;

        while (left + 3 <= rating.length) {
            if ((rating[left] < rating[middle] && rating[middle] < rating[right])
                    || (rating[left] > rating[middle] && rating[middle] > rating[right])) {
                numOfTeams++;
            }

            if (right == rating.length - 1) {
                if (right - middle == 1) {
                    left++;
                    middle = left + 1;

                } else {
                    middle++;
                }

                right = middle + 1;
            } else {
                right++;
            }

        }

        return numOfTeams;
    }


}
