package com.leetcode.example.greedy;

import java.util.ArrayList;
import java.util.List;

public class _763_PartitionLabels {
    public static void main(String[] args) {
        if (true) {
            _763_PartitionLabels c = new _763_PartitionLabels();

            String S = "ababcbacadefegdehijhklij";
            System.out.println("Result " + c.partitionLabels(S));
        }

        if (true) {
            _763_PartitionLabels c = new _763_PartitionLabels();

            String S = "ababcbacdefegdehijhklij";
            System.out.println("Result " + c.partitionLabels(S));
        }
    }

    public List<Integer> partitionLabels(String S) {
        List<Integer> ans = new ArrayList<>();
        int n = S.length();
        int[] ends = new int[127];
        for (int i = 0; i < n; i++) ends[S.charAt(i)] = i;

        int i = 0, j = 0;
        while (j < n) {
            int end = ends[S.charAt(j)];
            while (j < n && j <= end) {
                end = Math.max(end, ends[S.charAt(j)]);
                j++;
            }

            ans.add(j - i);
            i = j;
        }

        return ans;
    }

}
