package com.leetcode.example.array;

public class _11_ContainerWithMostWater {
    public static void main(String[] args) {
        //example 1
        if (true) {
            _11_ContainerWithMostWater c = new _11_ContainerWithMostWater();
            int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
            System.out.println("Max area = " + c.maxArea(arr));
        }

        //example 2
        if (true) {
            _11_ContainerWithMostWater c = new _11_ContainerWithMostWater();
            int[] arr = {1, 2};
            System.out.println("Max area = " + c.maxArea(arr));
        }

        //example 3
        if (true) {
            _11_ContainerWithMostWater c = new _11_ContainerWithMostWater();
            int[] arr = {1, 1};
            System.out.println("Max area = " + c.maxArea(arr));
        }
    }

    public int maxArea(int[] height) {
        int area = Integer.MIN_VALUE;
        int leftPointer = 0;
        int rightPointer = height.length - 1;

        while (leftPointer < rightPointer) {
            int min = Math.min(height[leftPointer], height[rightPointer]);
            int possibleArrea = min * (rightPointer - leftPointer);
            if (possibleArrea > area) {
                area = possibleArrea;
            }

            if (height[leftPointer] < height[rightPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }

        return area;
    }

}
