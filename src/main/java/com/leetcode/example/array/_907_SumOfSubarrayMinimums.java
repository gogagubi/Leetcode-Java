package com.leetcode.example.array;


public class _907_SumOfSubarrayMinimums {
    public static void main(String[] args) {
        if (true) {
            _907_SumOfSubarrayMinimums c = new _907_SumOfSubarrayMinimums();

            int[] A = {3, 1, 2, 4};
            System.out.println("Sum = " + c.sumSubarrayMins(A));
        }

        if (true) {
            _907_SumOfSubarrayMinimums c = new _907_SumOfSubarrayMinimums();

            int[] A = {85};
            System.out.println("Sum = " + c.sumSubarrayMins(A));
        }

        if (true) {
            _907_SumOfSubarrayMinimums c = new _907_SumOfSubarrayMinimums();

            int[] A = {59, 91};
            System.out.println("Sum = " + c.sumSubarrayMins(A));
        }

        if (true) {
            _907_SumOfSubarrayMinimums c = new _907_SumOfSubarrayMinimums();

            int[] A = {95, 58, 46, 67, 100};
            System.out.println("Sum = " + c.sumSubarrayMins(A));
        }

    }

    /*public int sumSubarrayMins(int[] A) {
        int MOD = 1_000_000_007;
        int N = A.length;

        // prev has i* - 1 in increasing order of A[i* - 1]
        // where i* is the answer to query j
        Stack<Integer> stack = new Stack();
        int[] prev = new int[N];
        for (int i = 0; i < N; ++i) {
            while (!stack.isEmpty() && A[i] <= A[stack.peek()])
                stack.pop();
            prev[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        // next has k* + 1 in increasing order of A[k* + 1]
        // where k* is the answer to query j
        stack = new Stack();
        int[] next = new int[N];
        for (int k = N-1; k >= 0; --k) {
            while (!stack.isEmpty() && A[k] < A[stack.peek()])
                stack.pop();
            next[k] = stack.isEmpty() ? N : stack.peek();
            stack.push(k);
        }

        // Use prev/next array to count answer
        long ans = 0;
        for (int i = 0; i < N; ++i) {
            ans += (i - prev[i]) * (next[i] - i) % MOD * A[i] % MOD;
            ans %= MOD;
        }
        return (int) ans;

    }*/

    public int sumSubarrayMins(int[] A) {
        int sum = 0;
        int MOD = 1_000_000_007;

        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {

                int min = Integer.MAX_VALUE;
                for (int k = i; k <= j; k++) {
                    min = Math.min(min, A[k]);
                }

                sum %= MOD;
                sum += min;
            }
        }

        return sum;
    }


}
