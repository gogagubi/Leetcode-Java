package com.leetcode.example.heap;

import com.leetcode.statics.util.Util;


import java.util.PriorityQueue;

public class _973_KClosestPointToOrigin {
    public static void main(String[] args) {
        if (true) {
            _973_KClosestPointToOrigin s = new _973_KClosestPointToOrigin();
            int[][] points = {{1, 3}, {-2, 2}};
            int K = 1;

            int[][] res = s.kClosest(points, K);
            Util.printPoints(res);
        }

        if (true) {
            _973_KClosestPointToOrigin s = new _973_KClosestPointToOrigin();
            int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
            int K = 2;

            int[][] res = s.kClosest(points, K);
            Util.printPoints(res);
        }
    }

    public int[][] kClosest(int[][] points, int K) {
        int index = 0;
        int[][] result = new int[K][2];

        PriorityQueue<int[]> heap = new PriorityQueue<>((p1, p2) -> {
            return (p1[0] * p1[0] + p1[1] * p1[1]) - (p2[0] * p2[0] + p2[1] * p2[1]);
        });

        for (int[] point : points) {
            heap.add(point);
        }

        while (!heap.isEmpty() && K-- > 0) {
            result[index++] = heap.remove();
        }

        return result;
    }
}
