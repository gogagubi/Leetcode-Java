package com.leetcode.example.math;

public class _204_CountPrimes {
    public static void main(String[] args) {
        if (true) {
            _204_CountPrimes c = new _204_CountPrimes();
            int n = 10;

            System.out.println("Result " + c.countPrimes(n));
        }

        if (true) {
            _204_CountPrimes c = new _204_CountPrimes();
            int n = 0;

            System.out.println("Result " + c.countPrimes(n));
        }

        if (true) {
            _204_CountPrimes c = new _204_CountPrimes();
            int n = 1;

            System.out.println("Result " + c.countPrimes(n));
        }
    }

    public int countPrimes(int n) {
        if(n <= 2) return 0;

        boolean[] sieve = new boolean[n];

        int i = 2;
        while(i * i < n){
            for(int j = i * i; j < n; j += i){
                sieve[j] = true;
            }

            i ++;
        }

        int count = 0;
        for(int j = 2; j < sieve.length; j ++){
            if(!sieve[j]) count ++;
        }

        return count;
    }
}
